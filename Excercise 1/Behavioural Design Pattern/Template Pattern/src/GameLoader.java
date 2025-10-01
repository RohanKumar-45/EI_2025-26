public abstract class GameLoader {

    
    public final void loadGame() {
        System.out.println("--- Starting Game Loading Process ---");
        
        initializeGraphics();

        loadAssets();

        loadConfiguration();

        if (isNetworkRequired()) {
            checkNetworkConnection();
        }

        startGame();

        System.out.println("--- Game Ready! ---\n");
    }

    protected abstract void initializeGraphics();

    protected abstract void loadAssets();

    protected abstract void loadConfiguration();

    private void startGame() {
        System.out.println("  5. Executing final startup script and launching main menu.");
    }

    protected boolean isNetworkRequired() {
        return false;
    }

    protected void checkNetworkConnection() {
        System.out.println("  4. Checking network connection and authenticating server.");
    }
}
