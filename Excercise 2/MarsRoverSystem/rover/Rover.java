package rover;

import grid.Grid;

import java.util.HashSet;
import java.util.Set;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private Grid grid;
    private Set<int[]> encounteredObstacles;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
        this.encounteredObstacles = new HashSet<>();
    }

    public void move() {
        int newX = x + direction.dx();
        int newY = y + direction.dy();
        if (grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY)) {
            x = newX;
            y = newY;
        } else if (grid.isObstacle(newX, newY)) {
            encounteredObstacles.add(new int[] { newX, newY });
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public StatusReport getStatusReport() {
        return new StatusReport(x, y, direction);
    }

    public Set<int[]> getEncounteredObstacles() {
        return encounteredObstacles;
    }
}
