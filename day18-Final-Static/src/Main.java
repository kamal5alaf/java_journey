import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Money m1 = Money.of(5.5, "JOD");
        Money m2 = m1.add(Money.of(5.5, "JOD"));
        Money m = Money.of(100, "USD").add(Money.of(50, "USA")).sub(Money.of(30, "USD")).multi(2);

        System.out.println(m);

        System.out.println(m1);
        System.out.println(m2);
        final List<String> names = new ArrayList<>();
        names.add("issa");

        user account = new user("kamal", "12345");

        try (ObjectOutputStream ob = new ObjectOutputStream(
                new FileOutputStream("User.ser"))) {

            ob.writeObject(account);
            System.out.println("Successfully saved: " + account.name);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        try (ObjectInputStream ob2 = new ObjectInputStream(
                new FileInputStream("User.ser"))) {

            user user2 = (user) ob2.readObject();

            System.out.println("Name: " + user2.name);
            System.out.println("Password: " + user2.Password);

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class user implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    transient String Password;

    public user(String name, String password) {
        this.name = name;
        this.Password = password;
    }
}