public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("  [Real Subject] Displaying: " + fileName + ".");
    }

    private void loadFromDisk(String fileName) {
        try {
            System.out.println("  [Real Subject] Loading " + fileName + " from storage... (This takes a moment)");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}