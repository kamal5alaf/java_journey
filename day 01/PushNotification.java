public class PushNotification extends Notification {

    String deviceToken;

    public PushNotification(String recipient, String message, String deviceToken) {
        super(recipient, message);
        this.deviceToken = deviceToken;
    }

    @Override
    void send() {
       System.out.println("[PUSH] Device: ["+deviceToken+"] | [message]");
    }
}
