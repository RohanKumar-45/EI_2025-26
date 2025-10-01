# Mars Rover Simulation 🚀

## Overview

This project is a Java-based Mars Rover Simulation that allows a Rover to navigate a user-defined grid. It supports movement, rotation, obstacle detection, and boundary handling. The goal is to demonstrate pure Object-Oriented Programming (OOP) principles along with design patterns such as the Command Pattern, Composite Pattern, and Singleton Pattern to ensure a clean and extensible architecture.

## Features

- Grid-Based Navigation: The Rover moves within a grid whose size is provided by the user, such as 8×12 or any custom dimensions.

- Rover Commands: The system supports commands like move forward, turn left, and turn right, allowing step-by-step navigation.

- Obstacle Detection: The Rover identifies obstacles placed at user-defined coordinates (e.g., (1,4), (4,6), (6,2)) and logs any encounters.

- Status Report: After executing the sequence of commands, the Rover reports its final position and direction (e.g., ending at (5,2) facing North).

- Design Patterns: The implementation follows OOP best practices and includes Command Pattern, Composite Pattern, and Singleton Pattern to ensure modularity, extensibility, and clean architecture.

## Key Components

### Grid

Represents the terrain on which the Rover moves. It validates boundary limits and tracks obstacle positions.

### Rover

The primary entity that holds its current coordinate, direction, and references to the grid. It executes commands and generates status reports.

### Commands

Commands are implemented using the Command Pattern. Commands such as Move, TurnLeft, and TurnRight are handled as individual classes, allowing flexible execution and future extensibility.

### Obstacles

Represents immovable objects on the grid. The Rover logs the coordinates of any obstacles it encounters during execution.

## Design Patterns

- *Command Pattern*: Encapsulates 'M', 'L', and 'R' commands as independent objects, enabling loose coupling between command execution and Rover logic.
- *Composite Pattern*: Represent complex terrain and group obstacle-related components when necessary.
- *Singleton Pattern*: Manages the grid state so that only one grid instance is used across the system.
- *OOP Principles*: Applies encapsulation, polymorphism, and inheritance effectively.


Follow the prompts to input grid size, obstacles, starting position, direction, and commands.

### Example

1. **Enter Grid Dimensions:**
   - `Enter grid width: 10`  
   - `Enter grid height: 10`

2. **Set Obstacles:**
   - `Enter number of obstacles: 2`
   - `Enter obstacle 1 x-coordinate: 2`
   - `Enter obstacle 1 y-coordinate: 2`
   - `Enter obstacle 2 x-coordinate: 3`
   - `Enter obstacle 2 y-coordinate: 5`

3. **Set Starting Position and Direction:**
   - `Enter starting x-coordinate: 0`
   - `Enter starting y-coordinate: 0`
   - `Enter starting direction (N/E/S/W): N`

4. **Enter Commands:**
   - `Enter the number of commands: 6`
   - `Enter commands (M for move, L for turn left, R for turn right):`

5. **Example Commands:**
   - `M` (Move forward)
   - `M` (Move forward)
   - `R` (Turn right)
   - `M` (Move forward)
   - `L` (Turn left)
   - `M` (Move forward)


6. **Output**

   - Rover is at (1, 3) facing North.
   - Rover encountered obstacles at: (2, 2)


## Code Structure

- *com.marsrover*: Main package
  - *commands*: Contains MoveCommand, TurnLeftCommand, and TurnRightCommand classes that implement the Command interface.
  - *grid*: Contains classes like Grid, Boundary, Obstacle, and terrain-related components.
  - *rover*: Includes Rover, Direction, StatusReport, and Coordinate classes.
  - *Main.java*: Serves as the entry point of the application and coordinates user interaction with the system.



## Contact

For any queries or further information, please reach out to [ajrohan45@gmail.com] .
