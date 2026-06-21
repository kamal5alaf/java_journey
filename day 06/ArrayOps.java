import java.util.Arrays;

class ArrayOps {

    // int min(int[] arr) — smallest value in the array
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    // int max(int[] arr) — largest value in the array
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // double average(int[] arr) — mean as double (no integer division)
    static double average(int[] arr) {
        int sum = 0;
        for (int v : arr) sum += v;
        return (double) sum / arr.length;
    }

    // int[] reverse(int[] arr) — returns NEW reversed array
    static int[] reverse(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }

        return res;
    }

    // boolean contains(int[] arr, int target) — linear search
    static boolean contains(int[] arr, int target) {
        for (int v : arr) {
            if (v == target) return true;
        }
        return false;
    }

    // int[] merge(int[] a, int[] b) — a followed by b
    static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            res[a.length + i] = b[i];
        }

        return res;
    }

    // int[] removeDuplicates(int[] arr) — no Set, no ArrayList (nested loop)
    static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int size = 0;

        for (int value : arr) {
            boolean found = false;

            for (int i = 0; i < size; i++) {
                if (temp[i] == value) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[size++] = value;
            }
        }
        return Arrays.copyOf(temp, size);
    }
}

public class Main {

    // Write method: int sum(int[] arr)
    static int sum(int[] arr) {
        int total = 0;
        for (int v : arr) {
            total += v;
        }
        return total;
    }

    public static void main(String[] args) {

        // ===================== HANDS-ON PRACTICE =====================

        // Create int[10], fill 10,20,...100
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        // print with Arrays.toString()
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        // sort + print
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

        // sum method
        System.out.println("Sum = " + sum(arr));

        // 3x3 Tic-Tac-Toe board
        char[][] board = {
                {'X', 'O', ' '},
                {'O', 'X', ' '},
                {' ', ' ', 'X'}
        };

        System.out.println("Tic Tac Toe:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // arr[10] safe check
        int index = 10;

        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds prevented");
        }

        // ===================== ARRAY OPS TEST =====================

        int[] a = {1, 2, 2, 3, 4};
        int[] b = {5, 6, 7};

        System.out.println("Min = " + ArrayOps.min(a));
        System.out.println("Max = " + ArrayOps.max(a));
        System.out.println("Average = " + ArrayOps.average(a));
        System.out.println("Contains 3 = " + ArrayOps.contains(a, 3));

        System.out.println("Reverse = " + Arrays.toString(ArrayOps.reverse(a)));
        System.out.println("Merge = " + Arrays.toString(ArrayOps.merge(a, b)));
        System.out.println("Remove Duplicates = " + Arrays.toString(ArrayOps.removeDuplicates(a)));
    }
}