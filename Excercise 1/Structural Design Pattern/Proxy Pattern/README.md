# Proxy Pattern - Image Loading Example

This project demonstrates the **Proxy Design Pattern** in Java using an image loading scenario. The proxy pattern is used to control access to a resource, in this case, large image files, by loading them only when needed.

## Structure
- `Image.java`: Interface defining the `displayImage()` method.
- `RealImage.java`: Implements `Image`, represents the actual image. Loads the image from disk when instantiated.
- `ImageProxy.java`: Implements `Image`, acts as a proxy to `RealImage`. Only loads the real image when `displayImage()` is called for the first time.
- `ProxyPatternImageDemo.java`: Demo class to show how the proxy works in practice.
- `Class_Diagram.png`: UML diagram illustrating the class relationships (if present).

## How It Works
1. The application creates `ImageProxy` objects for image files. The real images are **not loaded** at this point.
2. When `displayImage()` is called on a proxy, it loads the real image from disk (simulated with a delay) and displays it.
3. Subsequent calls to `displayImage()` on the same proxy do **not** reload the image; the already loaded image is displayed instantly.

## Output Example
```
--- Application Startup ---
[Proxy] ImageProxy created for large_photo_album_1.jpg. Real Image not loaded yet.
[Proxy] ImageProxy created for high_res_map_2.png. Real Image not loaded yet.

Application is running and ready. Images are proxies only.

--- User Scrolls to Image 1 (First Display) ---
[Proxy] Request to display received. Loading RealImage now...
  [Real Subject] Loading large_photo_album_1.jpg from storage... (This takes a moment)
  [Real Subject] Displaying: large_photo_album_1.jpg.

--- User Scrolls back to Image 1 (Second Display) ---
  [Real Subject] Displaying: large_photo_album_1.jpg.

--- User Scrolls to Image 2 (First Display) ---
[Proxy] Request to display received. Loading RealImage now...
  [Real Subject] Loading high_res_map_2.png from storage... (This takes a moment)
  [Real Subject] Displaying: high_res_map_2.png.
```

## How to Run
1. Compile all `.java` files:
   ```powershell
   javac *.java
   ```
2. Run the demo:
   ```powershell
   java ProxyPatternImageDemo
   ```

## Key Concepts
- **Proxy Pattern**: Controls access to a resource, adds lazy loading, and can add logging or security.
- **Lazy Loading**: Real images are loaded only when needed, saving resources.
