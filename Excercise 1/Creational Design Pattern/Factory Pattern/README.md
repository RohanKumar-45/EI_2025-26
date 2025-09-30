# Factory Design Pattern: Notification System Example

## Overview
This project demonstrates the Factory Design Pattern in Java by implementing a notification system that can send messages via Email or SMS. The system is easily extensible to support additional notification channels.

## Structure
- `Notification.java`: Interface defining the contract for notification channels.
- `EmailNotification.java`: Implements `Notification` for sending email notifications.
- `SMSNotification.java`: Implements `Notification` for sending SMS notifications.
- `NotificationFactory.java`: Factory class to create notification objects based on the requested type.
- `NotificationDemo.java`: Main class to demonstrate usage. Accepts user input for recipient details and message, then sends notifications via Email and SMS. Also demonstrates error handling for unsupported channels.

## How It Works
1. The user is prompted to enter an email address, phone number, and message.
2. The factory creates the appropriate notification object (`EmailNotification` or `SMSNotification`) based on the requested type.
3. The notification is sent to the provided recipient with the entered message.
4. If an unsupported notification type is requested, an error is shown.

## Usage
1. Compile all `.java` files:
   ```powershell
   javac *.java
   ```
2. Run the demo:
   ```powershell
   java NotificationDemo
   ```
3. Enter the required details when prompted.

## Example Output
```
--- Factory Design Pattern: Notification System Example ---
Enter Email Address: jane.doe@example.com
Enter Phone Number: +91-9876543210
Enter Message: Your order #90123 has been shipped and is expected to arrive on Tuesday.
Client 1: Requesting an EMAIL notification channel.
Email service provider connection initialized.
[EMAIL] Sending to jane.doe@example.com: 'Your order #90123 has been shipped and is expected to arrive on Tuesday....'

Client 2: Requesting an SMS notification channel.
SMS gateway connection initialized.
[SMS] Sending to +91-9876543210: 'Your order #90123 has been shipped and is expected to arrive on Tuesday....'

Client 3: Attempting to request an unsupported channel ('PUSH').
Client 3: Successfully caught error: Unknown notification type requested: PUSH
```

## Extending
To add a new notification channel:
1. Create a new class implementing `Notification`.
2. Add a case for the new type in `NotificationFactory.createNotification()`.

## License
This project is for educational purposes.
