import java.util.Arrays;

public class MathUtils {

    // add
    static int add(int a, int b) {
        return a + b;
    }

    // subtract
    static int subtract(int a, int b) {
        return a - b;
    }

    // divide
    static double divide(double a, double b) {
        if (b == 0) return 0.0;
        return a / b;
    }

    // max of 3 numbers
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // isPrime
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // fibonacci (recursive)
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // range
    static int[] range(int start, int end) {
        int[] arr = new int[end - start + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }

        return arr;
    }


    // MAIN (testing all methods)
    public static void main(String[] args) {

        // add
        System.out.println(add(2, 3));
        System.out.println(add(10, 5));

        // subtract
        System.out.println(subtract(10, 3));
        System.out.println(subtract(7, 2));

        // divide
        System.out.println(divide(10, 2));
        System.out.println(divide(5, 0));

        // max
        System.out.println(max(3, 7, 5));
        System.out.println(max(10, 2, 8));

        // isPrime checks
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));
        System.out.println(isPrime(1));

        // fibonacci
        System.out.println(fibonacci(10));

        // range
        System.out.println(Arrays.toString(range(1, 5)));
        System.out.println(Arrays.toString(range(3, 7)));
    }
}