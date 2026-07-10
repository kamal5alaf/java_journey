import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter expression (or quit): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            try {

                String[] parts = input.split(" ");

                if (parts.length != 3) {
                    throw new InvalidExpressionException("Expression must be 'number operator number'");
                }

                String part1 = parts[0];
                String op = parts[1];
                String part2 = parts[2];

                double num1;
                try {
                    num1 = Double.parseDouble(part1);
                } catch (NumberFormatException e) {
                    throw new InvalidExpressionException("Invalid number: " + part1);
                }

                double num2;
                try {
                    num2 = Double.parseDouble(part2);
                } catch (NumberFormatException e) {
                    throw new InvalidExpressionException("Invalid number: " + part2);
                }

                if ((op.equals("/") || op.equals("%")) && num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }

                double result;

                switch (op) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                    default:
                        throw new UnsupportedOperationException("Unknown operator: " + op);
                }

                System.out.printf("Result: %.2f%n", result);

            } catch (InvalidExpressionException e) {
                System.out.println("Format Error: " + e.getMessage());
            } catch (UnsupportedOperationException e) {
                System.out.println("Operator Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error: " + e.getMessage());
            } finally {
                System.out.println("Calculation attempt complete");
            }

            System.out.println();
        }

        sc.close();
    }
}