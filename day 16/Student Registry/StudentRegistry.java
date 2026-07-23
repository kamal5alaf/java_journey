import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StudentRegistry {

    private ArrayList<Student> Students = new ArrayList<>(List.of(new Student("k", 55, "Arabic")));


    public void enroll(Student S) {
        for (Student notInCollection : Students) {
            if (notInCollection.getName().equalsIgnoreCase(S.getName())) {
                System.out.println("Warning: A student with the name " + S.getName());
                return;
            }
        }
        this.Students.add(S);
    }

    public void remove(String S) {
        boolean Student = Students.removeIf(x -> x.getName().equalsIgnoreCase(S));
        if (!Student) {
            System.out.println("the Student not found");
        }
    }

    public void removeIf(String S) {
        for (int x = Students.size() - 1; 0 >= x; x--) {
            if (Students.get(x).getName().equalsIgnoreCase(S)) {
                Students.remove(x);
                System.out.println("removed succefully");
                return;
            }
        }
        System.out.println("Student not found: " + S);
    }

    public ArrayList<Student> findBySubject(String sub) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : Students) {
            if (student.getSubject().equalsIgnoreCase(sub)) {
                result.add(student);
            }
        }
        return result;
    }

    public void printStudents() {
        for (int i = 0; i < Students.size(); i++) {
            System.out.println(i + 1 + " Name : " + Students

                    .get(i).getName() + " Grade : " + Students

                    .get(i).getGrade() + "Subject : " + Students

                    .get(i).getSubject());
        }
    }

    public ArrayList<Student> getTopStudents(int n) {
        ArrayList<Student> collection = new ArrayList<>(Students);
        for (int i = 0; i < collection.size() - 1; i++) {
            for (int j = i + 1; j < collection.size(); j++) {
                if (collection.get(j).getGrade() > collection.get(i).getGrade()) {
                    Student opt = collection.get(i);
                    collection.set(i, collection.get(j));
                    collection.set(j, opt);
                }
                if (n > collection.size()) {
                    n = collection.size();
                }
            }
        }

        ArrayList<Student> result = new ArrayList<>();

        for (int s = 0; s <= n; s++) {
            result.add(collection.get(s));
        }

        return result;

    }




    public double averageGrade() {
        double total = 0;
        for (Student S : Students) {
            total += S.getGrade();
        }
        return total / Students.size();
    }


}