import java.util.ArrayList;

public class Course {

    private static int codeCount = 0;


    private String courseCode;
    private String name;
    private int creditHours;
    private ArrayList<Grade> grades;

    public String getCourseCode() {
        return courseCode;
    }
    public String getName() {
        return name;
    }
    public int getCreditHours() {
        return creditHours;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Course(String Code, String name, int creditHours) {
        codeCount++;

        this.courseCode = Code + codeCount;
        this.name = name;
        this.creditHours = creditHours;
    }

    public void addGrade(Grade grade) {
        if (grade.getScore() == 0 || grade.getExamName().equalsIgnoreCase(" ") || grade.getExamName() == null)
            System.out.println("the value is null or empty");

        if (grade == null) return;

        String examName = grade.getExamName();
        if (examName.equalsIgnoreCase(" ") || examName.isEmpty()) {
            System.out.println("the exam name is null or empty");
        }

        if (grade.getScore() != 0) grades.add(grade);
        else System.out.println("the Score is empty");
    }

    public double getAverageScore() {

        if (grades.size() == 0) {
            return 0.0;
        }

        int Total = 0;
        for (int x = 0; x < grades.size(); x++) {
            Total += grades.get(x).getScore();
        }

        return (double) Total / grades.size();
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Name: " + name + ", CreditHours: " + creditHours;
    }

    public  String getLetterGrade(double averageGrade){

        if (averageGrade >= 100)
            return "A+";
        else if (averageGrade >= 90)
            return "A";
        else if (averageGrade >= 80)
            return "B";
        else if (averageGrade >= 70)
            return "C";
        else if (averageGrade >= 60)
            return "D";
        else if (averageGrade >= 50)
            return "E";
        else
            return "F";

    }
}
