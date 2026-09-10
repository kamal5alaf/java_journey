import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id++;
    }

    public void enroll(Course c) {
        if (c == null) {
            return;
        }

        for (Course c1 : enrolledCourses) {
            if (c1.getCourseCode().equalsIgnoreCase(c.getCourseCode())) {
                System.out.println("Course already enrolled");
            }
        }

        enrolledCourses.add(c);
    }

    void recordGrade(String courseCode_, Grade g) {
        for (Course c : enrolledCourses) {
            String code  = c.getCourseCode();
            if (code.equalsIgnoreCase(courseCode_)) c.addGrade(g);
            return;
        }
        System.out.println("Course code not found");
    }

    void getGBA(){

        GradeCalculator.gpa(enrolledCourses);

    };


    @Override
    public String toString() {
        return  "Student [name=" + name + ", id=" + id + "]";
    }
}
