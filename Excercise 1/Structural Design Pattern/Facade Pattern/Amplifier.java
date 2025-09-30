public class Amplifier {
    private String description;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is ON.");
    }

    public void off() {
        System.out.println(description + " is OFF.");
    }

    public void setSurroundSound() {
        System.out.println(description + " set to surround sound mode.");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }
}
