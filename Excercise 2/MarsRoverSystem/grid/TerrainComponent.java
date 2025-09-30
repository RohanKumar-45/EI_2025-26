package grid;

public interface TerrainComponent {
    boolean blocks(int x, int y);
    default String name() {
        return getClass().getSimpleName();
    }
}


