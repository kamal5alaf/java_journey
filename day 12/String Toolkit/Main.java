import static java.util.Collections.reverse;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {

        //Task / Deliverable (1 hour)

        System.out.println("isPalindrome(\"Race Car\"): " + StringToolKit.isPalindrome("Race Car"));
        System.out.println("isPalindrome(\"hello\"): " + StringToolKit.isPalindrome("hello"));
        System.out.println("reverse(\"hello\"): " + StringToolKit.reverse("hello"));
        System.out.println("capitalize(\"hello world java\"): " + StringToolKit.capitalize("hello world java"));

        System.out.println("capitalize(\"\"): '" + StringToolKit.capitalize("") + "'");
        System.out.println("capitalize(\"Java\"): " + StringToolKit.capitalize("Java"));



        System.out.println("*************************************************************************************************************");

        //Hands-On Practice (1 hour)

        String a = "hello";
        String b = "hello";
        System.out.println(a == b);
        String c = new String("hello");
        System.out.println(a.equals(c));


        // ( == ) compare check if have same object in memory the * result = true or false
        // (.equals) check if both have same value * result = true or false

        String x = "eduucation";
        int count = 0;

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            System.out.println("number of vowels :" + count);
        }


        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= 99; i++) {
            str.append(i);
            str.append(",");
        }

        str.deleteCharAt(str.length() - 1);
        System.out.println(str.toString());

    }
}
