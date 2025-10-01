public class TemplatePatternGameDemo {

    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Loading a Simple Offline Game ---");
        GameLoader offlineLoader = new OfflineGameLoader();
        offlineLoader.loadGame(); 

        System.out.println("--- Scenario 2: Loading a Complex Online MMO Game ---");
        GameLoader mmoLoader = new MMOGameLoader();
        mmoLoader.loadGame(); 
    }
}