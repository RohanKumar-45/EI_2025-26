import java.util.Scanner;
public class NotificationDemo {
    public static void main(String[] args) {
        System.out.println("--- Factory Design Pattern: Notification System Example ---");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email Address: ");
        String userEmail = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String userPhone = scanner.nextLine();

        System.out.print("Enter Message: ");
        String longMessage = scanner.nextLine();

        try {
            System.out.println("Client 1: Requesting an EMAIL notification channel.");
            Notification emailSender = NotificationFactory.createNotification(NotificationFactory.EMAIL);
            emailSender.send(userEmail, longMessage);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Client 2: Requesting an SMS notification channel.");
            Notification smsSender = NotificationFactory.createNotification(NotificationFactory.SMS);
            smsSender.send(userPhone, longMessage);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Client 3: Attempting to request an unsupported channel ('PUSH').");
            Notification invalidChannel = NotificationFactory.createNotification("PUSH");
            invalidChannel.send("N/A", "Should not run.");
        } catch (IllegalArgumentException e) {
            System.err.println("Client 3: Successfully caught error: " + e.getMessage());
        }

        scanner.close();
    }
}
