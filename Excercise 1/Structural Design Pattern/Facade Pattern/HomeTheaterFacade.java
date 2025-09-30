public class HomeTheaterFacade {
    private Amplifier amp;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amp, Projector projector, Screen screen) {
        this.amp = amp;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie: " + movie);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(12);
    }

    public void endMovie() {
        System.out.println("\nShutting down the Home Theater...");
        amp.off();
        projector.off();
        screen.up();
    }
}