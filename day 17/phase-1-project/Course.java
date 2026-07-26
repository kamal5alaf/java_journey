import java.util.ArrayList;

public class Course {

    private String code ;
    private String name ;
    private int creditHours ;
    private ArrayList<Grade> grades ;

    public Course(String code, String name, int creditHours, ArrayList<Grade> grades) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.grades = grades;
    }

    public void addGrade(Grade g){
        grades.add(g);
    }

    public double getAverageScore(){
        return 0.0;
    }

    public void getLetterGrade(){
        System.out.println("Letter for Grade");
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", creditHours=" + creditHours +
                ", grades=" + grades +
                '}';
    }
}
