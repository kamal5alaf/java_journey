
import java.io.*;
import java.util.ArrayList;
import java.util.List;

void main()  {

    final List<String> names = new ArrayList<>();
    names.add(0, "issa");

    user account = new user("kamal", "12345");

    // Serialization
    try (ObjectOutputStream Ob = new ObjectOutputStream(
            new FileOutputStream("User.ser"))) {

        Ob.writeObject(account);
        System.out.println("Successfully saved: " + account.name);

    } catch (IOException EX) {
        System.out.println(EX.getMessage());
        return;
    }

    // Deserialization
    try (ObjectInputStream Ob2 = new ObjectInputStream(
            new FileInputStream("User.ser"))) {

        user user2 = (user) Ob2.readObject();

        System.out.println("Name: " + user2.name);
        System.out.println("Password: " + user2.Password);

    } catch (IOException | ClassNotFoundException EX) {
        System.out.println(EX.getMessage());
    }
}

class user implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    transient String Password ;

    public user(String name, String password) {
        this.name = name;
        this.Password = password;
    }
}
