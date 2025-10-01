public class ProxyPatternImageDemo {

    public static void main(String[] args) {
        System.out.println("--- Application Startup ---");
        
        Image image1 = new ImageProxy("large_photo_album_1.jpg");
        Image image2 = new ImageProxy("high_res_map_2.png");
        
        System.out.println("\nApplication is running and ready. Images are proxies only.");
        
        System.out.println("\n--- User Scrolls to Image 1 (First Display) ---");
        image1.displayImage(); 

        System.out.println("\n--- User Scrolls back to Image 1 (Second Display) ---");
        image1.displayImage();

        System.out.println("\n--- User Scrolls to Image 2 (First Display) ---");
        image2.displayImage();
    }
}