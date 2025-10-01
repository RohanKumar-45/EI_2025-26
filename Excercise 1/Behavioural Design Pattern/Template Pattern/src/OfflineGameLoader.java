public class OfflineGameLoader extends GameLoader {

    @Override
    protected void initializeGraphics() {
        System.out.println("  1. Initializing 2D renderer and basic audio system.");
    }

    @Override
    protected void loadAssets() {
        System.out.println("  2. Loading all sprites and level data from local disk cache.");
    }

    @Override
    protected void loadConfiguration() {
        System.out.println("  3. Reading local settings file (volume, difficulty, keybindings).");
    }

}
