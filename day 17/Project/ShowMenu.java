
import CustomException.CourseNotFoundException;
import CustomException.DuplicateIdException;
import CustomException.InvalidGradeException;
import CustomException.StudentNotFoundException;
import Models.Course;
import Models.Grade;
import Models.Student;

import java.util.*;

import static GradeCalculator.GradeCalculator.calculateGPA;
import static Registers.CourseRegistry.*;
import static Registers.StudentRegistry.*;

public class ShowMenu {

    static Scanner sc = new Scanner(System.in);

    public static void run() {

        boolean running = true;

        while (running) {

            System.out.println("===== Student Grade Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. Record Grade");
            System.out.println("5. View Student Transcript");
            System.out.println("6. View Top Students by GPA");
            System.out.println("7. View All Students in a Course");
            System.out.println("8. Remove Student");
            System.out.println("9. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");

            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {

                case 1:
                    addStudentMenu();
                    break;

                case 2:
                    addCourseMenu();
                    break;

                case 3:
                    enrollStudentInCourseMenu();
                    break;

                case 4:
                    recordGradeMenu();
                    break;

                case 5:
                    viewStudentTranscriptMenu();
                    break;

                case 6:
                    viewTopStudentsByGPA();
                    break;

                case 7:
                    viewAllStudentsInCourseMenu();
                    break;

                case 8:
                    removeStudentMenu();
                    break;

                case 9:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


}

public static void addStudentMenu() {
    System.out.println("Enter Student Name:");
    String name = ShowMenu.sc.toString();
    Student student = new Student(name);
    addStudent(student);

    System.out.println("Student Added Successfully");

}

public static void addCourseMenu() {
    System.out.println("Enter Course Name:");
    String name = ShowMenu.sc.toString();
    System.out.println("Enter Credit Hours :");
    int creditHour = ShowMenu.sc.nextInt();
    Course course = new Course(name, creditHour);
    addCourse(course);
    System.out.println("Course Added Successfully");
}

public static void enrollStudentInCourseMenu() {
    System.out.println("Enter Student Name Id ");
    String studentId = ShowMenu.sc.nextLine();
    System.out.println("Enter Course Id :");
    String courseId = ShowMenu.sc.nextLine();

    try {
        Student student = findById(studentId);
        Course course = findByCode(courseId);

        student.enroll(course);
    } catch (DuplicateFormatFlagsException e) {
        System.out.println("Student with this course already exists");
    }
    System.out.println("Student Enrolled Successfully");

}

public static void recordGradeMenu() {
    System.out.println("Enter Student Id :");
    String studentId = ShowMenu.sc.nextLine();

    System.out.println("Enter Course code :");
    String courseCode = ShowMenu.sc.nextLine();

    System.out.println("Enter Exam name :");
    String examName = ShowMenu.sc.nextLine();

    System.out.println("Enter score :");
    double score = ShowMenu.sc.nextDouble();

    try {
        Student student = findById(studentId);
        Grade grade = new Grade(examName, score);

        student.recordGrade(courseCode, grade);
        System.out.println("Grade recorded successfully.");
    } catch (CourseNotFoundException | StudentNotFoundException exception) {
        System.out.println("Student with this course does not exist");
    } catch (InvalidGradeException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

public static void viewStudentTranscriptMenu() {

    String studentId = ShowMenu.sc.nextLine();
    Student student = findById(studentId);
    try {
        System.out.println("Student Transcript:");
        System.out.println("Student Id " + student.getId());
        System.out.println("Student Name " + student.getName());
        for (Course c : student.getEnrolledCourses()) {
            System.out.println("Course Name : " + c.getName());
            System.out.println("Credit Hours : " + c.getCreditHours());

            double av = c.getAverageScore();
            System.out.println("Score : " + av);
            System.out.println("Letter Grade" + c.getLetterGrade(av));
        }
        System.out.println("Total Average : " + calculateGPA(student.getEnrolledCourses()));
        System.out.println("Student Enrolled Successfully");

    } catch (StudentNotFoundException exception) {
        System.out.println("Student with this course does not exist");
    }
}

public static void viewTopStudentsByGPA() {
    Student student = null;
    double gpa = 0;
    for (Student S : getStudents()) {
        double highestGPA = S.getGBA();
        if (gpa < highestGPA) {
            highestGPA = gpa;
            student = S;
        }

    }

    System.out.println("Student Top Students by GPA: " + gpa);
    System.out.println("Student Name: " + student.getName());
    System.out.println("Student Top Students by GPA Successfully");
}

public static void viewAllStudentsInCourseMenu() {

    ArrayList<Student> students = new ArrayList<>();

    System.out.println("Enter C Id:");
    String courseCode = ShowMenu.sc.nextLine();

    for (Student s : getStudents()) {

        for (Course c : s.getEnrolledCourses()) {

            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                students.add(s);
                break;
            }
        }
    }

    if (students.isEmpty()) {
        throw new StudentNotFoundException(
                "No students are enrolled in this course"
        );
    }

    System.out.println("Students:");

    for (Student s : students) {
        System.out.println(
                "ID: " + s.getId() +
                        ", Name: " + s.getName()
        );
    }
}

public static void removeStudentMenu() {

    System.out.println("Enter Student Id:");
    String studentId = ShowMenu.sc.nextLine();

    try {
        removeStudent(studentId);
        System.out.println("Student removed successfully.");

    } catch (StudentNotFoundException e) {
        System.out.println(e.getMessage());
    }
}

void main() {
}


