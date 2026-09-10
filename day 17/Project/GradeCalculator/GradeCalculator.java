import java.util.ArrayList;

public class GradeCalculator {
    public static double average(ArrayList<Grade> grades) {
        if (grades.isEmpty()) return 0;
        double total = 0;

        for (int x = 0; x < grades.size(); x++) {
            total += grades.get(x).getScore();
        }
        return total / grades.size();
    }

    public static String letterGrade(double Score) {
        if (Score < 0 || Score > 100) {
            return "The input value must be between 0 and 100";
        }

        int grandTotal = (int) Score / 10;

        return switch (grandTotal) {
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

    }


    public static void gpa(ArrayList<Course> enrolledCourses) {
    }
}
