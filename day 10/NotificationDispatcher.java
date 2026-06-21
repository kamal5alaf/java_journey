

public class NotificationDispatcher {

    Notification[] notifications = new Notification[20];
    int count = 0;

    void add(Notification obj) {
        if (count < notifications.length) {
            notifications[count] = obj;
            count++;
        }
    }

    void sendAll() {
        for (int i = 0; i < count; i++) {
            notifications[i].send();
        }
    }

    void countByType() {
        int countEmail = 0;
        int countSMS = 0;
        int countPush = 0;


        for (int i = 0; i < count; i++) {
            if (notifications[i] instanceof EmailNotification) {
                countEmail++;
            }
            if (notifications[i] instanceof SMSNotification) {
                countEmail++;
            }
            if (notifications[i] instanceof PushNotification) {
                countEmail++;
            }
            System.out.println("Emails: " + countEmail);
            System.out.println("SMS: " + countSMS);
            System.out.println("Push: " + countPush);
        }
    }
}
