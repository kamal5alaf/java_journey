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

                String[] parts = validateInput(input);

                String part1 = parts[0];
                String op = parts[1];
                String part2 = parts[2];

                double num1 = parsingDouble(part1);
                double num2 = parsingDouble(part2);

                double result = calculate(op, num1, num2);

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

    public static String[] validateInput(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new InvalidExpressionException("Expression must be 'number operator number'");
        }
        return parts;
    }

    public static double parsingDouble(String num) {
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            throw new InvalidExpressionException("Invalid number: " + num);
        }
    }

    public static double calculate(String op, double num1, double num2) {
        return switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;

            case "/" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                yield num1 / num2;
            }

            case "%" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                yield num1 % num2;
            }

            default -> throw new UnsupportedOperationException("Unknown operator: " + op);
        };
    }
}