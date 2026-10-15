package Registers;


import CustomException.DuplicateIdException;
import CustomException.StudentNotFoundException;
import Models.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentRegistry {
    private static HashMap<String, Student> students = new HashMap<>();


    public static void addStudent(Student s) throws DuplicateIdException {

        if (s == null) throw new NullPointerException("student is null");
        if (students.containsKey(s.getId())) throw new DuplicateIdException("student is already in registry");
        students.put(s.getId(), s);

    }

    public static void removeStudent(String id) {
        students.remove(id);
    }

    public static Student findById(String id) throws StudentNotFoundException {

        for (Student student : students.values()) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found");
    }

    public static String findByName(String name) throws StudentNotFoundException {
        for (Student s : students.values()) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s.getName();
            }
        }
        throw new StudentNotFoundException("student not found");
    }

    public static ArrayList<Student> getStudents() {
        if (students.isEmpty()) throw new NullPointerException("student is empty");
        return new ArrayList<>(students.values());
    }

}
