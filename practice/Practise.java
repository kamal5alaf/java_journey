import java.util.Arrays;

public class Practise {

    public static void carpetArea(int length, int width) {
        int carpetArea = length * width;
        System.out.println("Carpet Area: " + carpetArea);
    }

    public static void amountPerPerson(double billOFAmount, int numberOfPersons) {
        double amountPerPerson = billOFAmount / numberOfPersons;
        System.out.println("Bill of Amount : " + billOFAmount + " Number of person :" + numberOfPersons);
        System.out.println("Number of Persons :" + amountPerPerson);
    }

    public static void celsiusToFahrenheit(double celsius) {
        double fahrenhait = celsius * 9 / 5 + 32;
        System.out.println(fahrenhait);
    }

    public static int[] packEgg(int eggs) {
        int[] egg = new int[2];
        egg[0] = eggs / 12;
        egg[1] = eggs % 12;
        return egg;
    }

    public static String canPair(int guests) {
        return guests % 2 == 0 ? "Yes" : "No";
    }

    public static int ticketPrice(int age) {
        if (age <= 12) return 5;
        else if (age >= 65) return 7;
        else return 10;
    }

    public static int[] splitDuration(int totalSeconds) {
        int[] result = new int[2];
        result[0] = totalSeconds / 60;
        result[1] = totalSeconds % 60;
        return result;
    }

    public static double amountToPay(double orderTotal) {
        if (orderTotal >= 200) return orderTotal;
        else return orderTotal + 15;
    }

    public static double basketTotal(double[] prices) {
        double result = 0.0;
        for (int i = 0; i < prices.length; i++) {
            result += prices[i];
        }
        return result;
    }

    public static int hottestDay(int[] temps) {
        int high = 0;
        for (int x : temps) {
            int current = x;
            if (high < current) {
                high = current;
            }
        }
        return high;
    }

    public static int countRainyDays(int[] rainfall) {
        int count = 0;
        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] >= 0) count++;
        }
        return count;
    }

    public static double classAverage(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    public static int finalBalance(int startBalance, int[] transactions) {
        int balance = startBalance;
        for (int x : transactions) {
            balance += x;
        }
        return balance;
    }


    public static String[] conveyorTags(int n) {

        String[] tags = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) tags[i - 1] = "purpule";
            else if (i % 3 == 0) tags[i - 1] = "red";
            else if (i % 5 == 0) tags[i - 1] = "blue";
            else tags[i - 1] = "non";
        }
        return tags;

    }

    public static String checkGuest(String[] guestList, String name) {
        if (Arrays.asList(guestList).contains(name)) {
            return "allowed";
        } else {
            return "denied";
        }
    }

    public static int countVowels(String name) {
        int count = 0;
        for (char c : name.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int longestWinStreak(String results) {
        int current = 0;
        int max = 0;
        for (char c : results.toCharArray()) {
            if (c == 'W') {
                current++;
                if (current > max) {
                    max = current;
                }
            } else current = 0;
        }
        return max;
    }

    public static int fewestCoins(int amount) {
        int count = 0;

        for (int j = 1; j <= amount; j++) {
            if (amount >= 25) {
                amount = amount - 25;
                ++count;
            }

            if (amount <= 24 && amount >= 10) {
                amount = amount - 10;
                count++;
            }
            if (amount >= 1) {
                amount = amount - 1;
                count++;
            }
        }
        return count;
    }

    public static String canFulfill(int[] stock, int[] order) {
        String result = "";
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] >= order[i]) ;
            else return "rejected";
        }
        return "filfiled";
    }

    public static int finalFloor(int topFloor, int[] moves) {
        int movement = 0;
        for (int i = 0; i < moves.length ; i++) {
            if (!(moves[i] + movement < 0) && !(moves[i] + movement > topFloor)) {
                movement += moves[i] ;
            }

        }
        return movement;
    }


}






