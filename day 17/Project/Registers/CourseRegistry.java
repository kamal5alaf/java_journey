package Registers;

import CustomException.CourseNotFoundException;
import Models.Course;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CourseRegistry {
    private static HashMap<String, Course> courses = new HashMap<String, Course>();


    public static void addCourse(Course course) {

        if (courses.isEmpty() || course == null) throw new NullPointerException("courses == null");
        if (courses.containsKey(course.getCourseCode())) courses.put(course.getCourseCode(), course);

    }

    public static Course findByCode(String courseCode) {

        if (courses == null) { throw new NullPointerException("courses == null"); }
        Course course = courses.get(courseCode);
        if (course == null) { throw new CourseNotFoundException("Course not found: " + courseCode); }
        return course;
    }

    public static ArrayList<Course> getAllCourses() {
        if (courses == null) throw new NullPointerException("courses == null");
        return new ArrayList<>(courses.values());
    }
}
