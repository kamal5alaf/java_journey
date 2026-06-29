
public class StringToolKit {

    static String reverse(String s) {
        if (s == null) return null;
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    static boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.toLowerCase().replace(" ", "");
        String reversed = reverse(cleaned);
        return cleaned.equals(reversed);
    }

    static public int countOccurrences(String str, char c) {
        if (str == null) return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    static public String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    static public String removeWhitespace(String str) {
        if (str == null) {return null;}
        return str.replaceAll("\\s+", "");
    }

    static public String[] splitAndTrim(String csv) {
        if (csv == null) return new String[0];
        String[] parts = csv.split(",");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }
        return parts;
    }
}