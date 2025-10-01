public class MMOGameLoader extends GameLoader {

    @Override
    protected void initializeGraphics() {
        System.out.println("  1. Initializing high-end 3D engine, shader compilation, and Dolby audio.");
    }

    @Override
    protected void loadAssets() {
        System.out.println("  2. Streaming high-resolution textures and character models from CDN.");
    }

    @Override
    protected void loadConfiguration() {
        System.out.println("  3. Fetching user profile and game world instance ID from server API.");
    }

    @Override
    protected boolean isNetworkRequired() {
        return true;
    }

    @Override
    protected void checkNetworkConnection() {
        System.out.println("  4. Establishing secure socket connection and performing authentication handshake.");
    }
}