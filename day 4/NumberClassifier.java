import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class NumberClassifier {

    public static void main(String[] args) {

        // (1) Switch example - month
        int month = 4;

        String result = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };

        out.println(result);

        // (2) do-while input validation
        Scanner scanner = new Scanner(in);
        int num;

        do {
            out.println("Enter the number: from 1 to 10");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        out.println("Valid number entered");

        // (3) Multiplication table 5x5
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                out.print(row * col + " ");
            }
            out.println();
        }

        // (4) Number Classifier (MAIN TASK)
        int fizz = 0;
        int buzz = 0;
        int fizzBuzz = 0;
        int squares = 0;

        for (int i = 1; i <= 100; i++) {

            boolean isSquare = false;

            int root = (int) Math.sqrt(i);
            if (root * root == i) {
                isSquare = true;
                squares++;
            }

            if (i % 3 == 0 && i % 5 == 0) {
                out.println("FizzBuzz");
                fizzBuzz++;

            } else if (i % 3 == 0) {
                out.println("Fizz");
                fizz++;

            } else if (i % 5 == 0) {
                out.println("Buzz");
                buzz++;

            } else if (isSquare) {
                out.println("Square: " + i);

            } else {
                out.println(i);
            }
        }

        // (5) Summary
        out.println("\n--- Summary ---");
        out.println("Fizz: " + fizz);
        out.println("Buzz: " + buzz);
        out.println("FizzBuzz: " + fizzBuzz);
        out.println("Squares: " + squares);
    }


}