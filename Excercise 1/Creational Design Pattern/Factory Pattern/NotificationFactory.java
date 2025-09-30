public class NotificationFactory {

    public static final String EMAIL = "EMAIL";
    public static final String SMS = "SMS";

    public static Notification createNotification(String type) {
        
        switch (type.toUpperCase()) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type requested: " + type);
        }
    }
}