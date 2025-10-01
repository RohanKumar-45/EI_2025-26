public class ImageProxy implements Image {
    private RealImage realImage; 
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("[Proxy] ImageProxy created for " + fileName + ". Real Image not loaded yet.");
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            System.out.println("[Proxy] Request to display received. Loading RealImage now...");
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}