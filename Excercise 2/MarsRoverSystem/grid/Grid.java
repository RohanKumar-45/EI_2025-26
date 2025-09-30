package grid;

import java.util.HashSet;
import java.util.Set;
import utils.EventLogger;

public class Grid {
    private int width;
    private int height;
    private Set<Obstacle> obstacles;
    private final TerrainComposite terrain;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>();
        this.terrain = new TerrainComposite().add(new Boundary(width, height));
        EventLogger.info("Grid created: %dx%d", width, height);
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
        terrain.add(obstacle);
        EventLogger.info("Obstacle added at (%d, %d)", obstacle.getX(), obstacle.getY());
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.contains(new Obstacle(x, y));
    }

    public boolean isWithinBounds(int x, int y) {
        boolean outOfBounds = new Boundary(width, height).blocks(x, y);
        if (outOfBounds) {
            EventLogger.info("Out of bounds check failed for (%d, %d)", x, y);
        }
        return !outOfBounds;
    }

    public boolean blocks(int x, int y) {
        return terrain.blocks(x, y);
    }
}
