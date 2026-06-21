public class SMSNotification extends Notification {
    String phoneNumber;

    SMSNotification(String recipient, String message, String phoneNumber) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    void send() {
        System.out.println("[SMS] To:" + phoneNumber + " | [ " + message + "]");
    }
}
