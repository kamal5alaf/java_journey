import java.util.Objects;

public class Practise02 {

    public static String phoneNumberCleaner(String number) {
        String number2 = number.trim().replace(" ", "").replaceAll("[()\\-_+#*]", "");

        if (number2.startsWith("009627") && number2.length() == 14) return number2.replaceFirst("00962", "+9627");
        else if (number2.startsWith("+9627") && number2.length() == 13) return number2.replaceFirst("962", "+9627");
        else if (number2.startsWith("07") && number2.length() == 10) return number2.replaceFirst("07", "+9627");
        else if (number2.startsWith("7") && number2.length() == 9) return number2.replaceFirst("7", "+9627");
        else return "invalid";
    }

}






