public class Screen {
    private String description;

    public Screen(String description) {
        this.description = description;
    }

    public void down() {
        System.out.println(description + " lowering into viewing position.");
    }

    public void up() {
        System.out.println(description + " retracting.");
    }
}
