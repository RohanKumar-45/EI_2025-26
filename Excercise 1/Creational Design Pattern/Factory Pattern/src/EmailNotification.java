public class EmailNotification implements Notification {
    
    public EmailNotification() {
        System.out.println("Email service provider connection initialized.");
    }

    @Override
    public void send(String recipient, String message) {
        System.out.printf("[EMAIL] Sending to %s: '%.80s...'\n", recipient, message);
    }
}