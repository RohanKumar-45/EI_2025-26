public class Projector {
    private String description;

    public Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is ON.");
    }

    public void off() {
        System.out.println(description + " is OFF.");
    }

    public void wideScreenMode() {
        System.out.println(description + " set to widescreen mode (16:9).");
    }
}