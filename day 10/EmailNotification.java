public class EmailNotification extends Notification {
    String subject;

    EmailNotification(String recipient, String message ,  String subject) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("[EMAIL] Subject: [subject] | To: [recipient] | [message]");
    }
}
