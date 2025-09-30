import java.util.Scanner;

public class FacadePatternDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter description for Amplifier: ");
        String ampDesc = scanner.nextLine();
        Amplifier amp = new Amplifier(ampDesc);

        System.out.print("Enter description for Projector: ");
        String projectorDesc = scanner.nextLine();
        Projector projector = new Projector(projectorDesc);

        System.out.print("Enter description for Screen: ");
        String screenDesc = scanner.nextLine();
        Screen screen = new Screen(screenDesc);

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, screen);

        System.out.print("Enter movie name to watch: ");
        String movieName = scanner.nextLine();
        homeTheater.watchMovie(movieName);

        homeTheater.endMovie();

        scanner.close();
    }
}