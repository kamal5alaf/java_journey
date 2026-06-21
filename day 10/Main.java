public class Main {

    public static void main(String[] args) {

        NotificationDispatcher dispatcher = new NotificationDispatcher();

        dispatcher.add(new EmailNotification("kamal@gmail.com", "hello", "kk"));

        dispatcher.add(new SMSNotification("mohammed@gmail.com", "bye", "hh"));

        dispatcher.add(new PushNotification("kamal@gmail.com", "hello", "zz"));

        dispatcher.add(new SMSNotification("mohammed@gmail.com", "bye", "hh"));

        dispatcher.add(new PushNotification("kamal@gmail.com", "hello", "zz"));

        System.out.println("**** Sending Notifications ****");
        dispatcher.sendAll();

        System.out.println("**** Count By Type ****");
        dispatcher.countByType();
    }
}