import commands.*;
import grid.*;
import rover.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n=== MARS ROVER SIMULATOR ===\n");
            // Input Grid Size
            System.out.print("Enter grid width: ");
            int width = scanner.nextInt();
            System.out.print("Enter grid height: ");
            int height = scanner.nextInt();

            // Validate grid dimensions
            if (width <= 0 || height <= 0) {
                System.out.println("Error: Grid dimensions must be positive integers.");
                return;
            }

            // Initialize Grid
            Grid grid = new Grid(width, height);
            Boundary boundary = new Boundary(width, height);

            // Input Obstacles
            System.out.print("Enter number of obstacles: ");
            int numObstacles = scanner.nextInt();
            
            if (numObstacles < 0) {
                System.out.println("Error: Number of obstacles cannot be negative.");
                return;
            }

            for (int i = 0; i < numObstacles; i++) {
                System.out.print("Enter obstacle " + (i + 1) + " x-coordinate: ");
                int ox = scanner.nextInt();
                System.out.print("Enter obstacle " + (i + 1) + " y-coordinate: ");
                int oy = scanner.nextInt();
                
                // Validate obstacle position is within grid bounds using Boundary class
                if (boundary.blocks(ox, oy)) {
                    System.out.println("Warning: Obstacle at (" + ox + ", " + oy + ") is outside grid bounds. Skipping...");
                    continue;
                }
                
                grid.addObstacle(new Obstacle(ox, oy));
            }

            // Input Starting Position with validation
            int startX = -1, startY = -1; // Initialize with default values
            Direction startDirection;
            boolean validStartingPosition = false;
            
            while (!validStartingPosition) {
                System.out.print("Enter starting x-coordinate: ");
                startX = scanner.nextInt();
                System.out.print("Enter starting y-coordinate: ");
                startY = scanner.nextInt();
                
                // Check if starting position is within boundaries using Boundary class
                if (boundary.blocks(startX, startY)) {
                    System.out.println("Error: Starting position (" + startX + ", " + startY + ") is outside grid boundaries.");
                    System.out.println("Grid dimensions are " + boundary.getWidth() + "x" + boundary.getHeight() + ". Valid coordinates are (0,0) to (" + (boundary.getWidth()-1) + "," + (boundary.getHeight()-1) + ").");
                    System.out.println("Please re-enter the starting position.");
                    continue;
                }
                
                // Check if starting position is at an obstacle using Grid's isObstacle method
                if (grid.isObstacle(startX, startY)) {
                    System.out.println("Error: Starting position (" + startX + ", " + startY + ") is blocked by an obstacle.");
                    System.out.println("Please re-enter the starting position.");
                    continue;
                }
                
                // If we reach here, the starting position is valid
                validStartingPosition = true;
            }

            // Input Starting Direction with default handling
            System.out.print("Enter starting direction (N/E/S/W): ");
            String directionInput = scanner.next().toUpperCase();
            
            try {
                startDirection = Direction.valueOf(directionInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Warning: Invalid direction '" + directionInput + "'. Using default direction 'N' (North).");
                startDirection = Direction.N;
            }

            // Initialize Rover
            Rover rover = new Rover(startX, startY, startDirection, grid);

            // Input Commands
            System.out.print("Enter the number of commands: ");
            int numCommands = scanner.nextInt();
            
            if (numCommands < 0) {
                System.out.println("Error: Number of commands cannot be negative.");
                return;
            }

            List<Command> commands = new ArrayList<>();
            
            if (numCommands > 0) {
                System.out.println("Enter commands (M for move, L for turn left, R for turn right):");
                for (int i = 0; i < numCommands; i++) {
                    System.out.print("Command " + (i + 1) + ": ");
                    String cmdInput = scanner.next().toUpperCase();
                    char cmd = cmdInput.charAt(0);
                    
                    switch (cmd) {
                        case 'M' -> commands.add(new MoveCommand());
                        case 'L' -> commands.add(new TurnLeftCommand());
                        case 'R' -> commands.add(new TurnRightCommand());
                        default -> {
                            System.out.println("Warning: Invalid command '" + cmd + "'. Skipping this command.");
                            i--; // Decrement counter to re-enter this command
                        }
                    }
                }
            }

            // Execute Commands
            System.out.println("\nExecuting commands...");
            for (Command command : commands) {
                command.execute(rover);
            }

            // Get Status Report
            StatusReport statusReport = rover.getStatusReport();
            System.out.println("\nFinal Status:");
            System.out.println(statusReport);

            // Print Encountered Obstacles
            Set<int[]> encounteredObstacles = rover.getEncounteredObstacles();
            if (!encounteredObstacles.isEmpty()) {
                System.out.println("\nRover encountered obstacles at:");
                for (int[] obstacle : encounteredObstacles) {
                    System.out.printf("(%d, %d)%n", obstacle[0], obstacle[1]);
                }
            } else {
                System.out.println("\nRover did not encounter any obstacles.");
            }

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}