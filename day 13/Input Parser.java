import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String[] names = new String[5];
        Object[] values = new Object[5];

        for (int i = 0; i < 5; i++) {


            System.out.print("Please enter item " + (i + 1) + " (name:value): ");

            String line = obj.nextLine();

            String[] parts = line.split(":");

            String name = parts[0].trim();
            String rawValue = parts[1].trim();

            names[i] = name;
            values[i] = detectType(rawValue);
        }

        System.out.println("******************* The Result *******************");

        for (int i = 0; i < 5; i++) {
            System.out.println(
                    names[i] + " (" + values[i].getClass().getSimpleName() + ")    " + values[i]
            );
        }

        obj.close();
    }

    private static Object detectType(String value) {

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
        }

        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
        }

        if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(value);
        }

        return value;
    }
}
