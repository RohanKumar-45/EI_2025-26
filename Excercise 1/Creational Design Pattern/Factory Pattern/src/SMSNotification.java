public class SMSNotification implements Notification {
    
    public SMSNotification() {
        System.out.println("SMS gateway connection initialized.");
    }

    @Override
    public void send(String recipient, String message) {
        String shortMessage = (message.length() > 160) ? message.substring(0, 157) + "..." : message;
        System.out.printf("[SMS] Sending to %s: '%.50s...'\n", recipient, shortMessage);
    }
}
