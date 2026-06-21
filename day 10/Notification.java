public class Notification {

    String recipient;
    String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    void send() {
        System.out.println("recipient : message");
    }

}
