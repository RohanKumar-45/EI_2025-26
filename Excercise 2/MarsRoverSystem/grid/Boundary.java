package grid;

public class Boundary implements TerrainComponent {
    private final int width;
    private final int height;

    public Boundary(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean blocks(int x, int y) {
        return x < 0 || x >= width || y < 0 || y >= height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}


