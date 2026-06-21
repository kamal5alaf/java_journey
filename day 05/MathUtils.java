import java.util.Arrays;

public class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return 0.0;
        }
        return a / b;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static int[] range(int start, int end) {
        int[] result = new int[end - start + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }

        return result;
    }

    public static void main(String[] args) {

        // add
        System.out.println(add(5, 3));
        System.out.println(add(10, 20));

        // subtract
        System.out.println(subtract(10, 4));
        System.out.println(subtract(20, 7));

        // multiply
        System.out.println(multiply(3, 4));
        System.out.println(multiply(5, 6));

        // divide
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));

        // isPrime
        System.out.println("1: " + isPrime(1));   // false
        System.out.println("2: " + isPrime(2));   // true
        System.out.println("3: " + isPrime(3));   // true
        System.out.println("4: " + isPrime(4));   // false
        System.out.println("17: " + isPrime(17)); // true
        System.out.println("18: " + isPrime(18)); // false

        // fibonacci
        System.out.println(fibonacci(10)); // 55
        System.out.println(fibonacci(7));  // 13

        // range
        System.out.println(Arrays.toString(range(1, 5)));
        System.out.println(Arrays.toString(range(10, 15)));
    }
}