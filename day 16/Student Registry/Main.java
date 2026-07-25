import javax.print.attribute.standard.MediaSize;
import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Objects.requireNonNull;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

//  PRACTICE  name : kamal
//        ArrayList<String> names = new ArrayList<>(List.of("kamal", "mohamed", "sami", "Ali", "Alaa"));
//
//        names.add("Yasser");
//        names.add("Sami");
//
//        names.remove("kamal");
//        names.remove(1);
//
//
//        names.forEach(System.out::println);
//
//
//        Map<String, Integer> Cities = new HashMap<>();
//        Cities.put("Amman", 1000082);
//        Cities.put("jeddah", 1000589);
//        Cities.put("Riyadh", 1094582);
//        Cities.put("Irbid", 18999982);
//        Cities.put("ramthah", 1094582);
//
//        for (Map.Entry<String, Integer> enter : Cities.entrySet()) {
//            System.out.println("City=> " + enter.getKey() + " Code =>" + enter.getValue());
//        }
//
//
//        ArrayList<Integer> numbers = new ArrayList<>(List.of(66, 999, 66));
//
//        for (int i = numbers.size() - 1; 0 >= i; i--) {
//            if (numbers.get(i) == 66) {
//                numbers.remove(i);
//            }
//        }
//
//        for (Integer num : numbers) {
//            if (num == 66) {
//            }
//        }

// TASK


        StudentRegistry registry = new StudentRegistry();


        registry.enroll(new Student("Omar", 70, "English"));
        registry.enroll(new Student("Ahmad", 95, "English"));
        registry.enroll(new Student("Kamal", 88, "Physics"));
        registry.enroll(new Student("Lina", 92, "Physics"));

        ArrayList<Student> mathStudents = registry.findBySubject("Math");
        for (Student s : mathStudents) {
            System.out.println(s.getName() + " | " + s.getSubject() + " | " + s.getGrade());
        }

        ArrayList<Student> topStudents = registry.getTopStudents(0);
        for (Student s : topStudents) {
            System.out.println(s.getName() + " | " + s.getSubject() + " | " + s.getGrade());
        }

        System.out.println(registry.averageGrade());
    }

}