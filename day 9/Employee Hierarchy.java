public class Main {

    public static void main(String[] args) {

        Employee E = new Employee("Ahmed", 5000);
        Manager M = new Manager("Kamal", 12000, 8);
        Intern I = new Intern("Mohammed", 2500, 6);
        Contractor C = new Contractor("Omar", 0, 80.0, 160);

        Employee[] Employees = {E, M, I, C};
        for (Employee e : Employees) {
            System.out.println(e.getDetails());
        }


        double totalPayroll = 0;

        for (Employee e : Employees) {
            totalPayroll += e.calculateMonthlyBonus() + e.getBaseSalary();
        }
        System.out.println("Total Payroll : " + totalPayroll);


    }


}


class Employee {
    private String Name;
    private double baseSalary;

    Employee(String Name, double baseSalary) {
        this.Name = Name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDetails() {
        return Name + "|| Salary : " + baseSalary;
    }

    public double calculateMonthlyBonus() {return 0.0;}

}

class Manager extends Employee {
    private int teamSize;

    Manager(String Name, double baseSalary, int teamSize) {
        super(Name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateMonthlyBonus() {
        return getBaseSalary() * 0.15;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "Team Size : " + teamSize;
    }
}

class Contractor extends Employee {
    private double hourlyRate;
    private int hoursThisMonth;

    Contractor(String Name, double baseSalary, double hourlyRate, int hoursThisMonth) {
        super(Name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursThisMonth = hoursThisMonth;
    }

    @Override
    public double calculateMonthlyBonus() {
        return hoursThisMonth * hourlyRate;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "Rate : $[" + hourlyRate + "]/hr" + "[" + hoursThisMonth + "] hours";
    }
}

class Intern extends Employee {
    private int durationMonths;

    Intern(String Name, double baseSalary, int durationMonths) {
        super(Name, baseSalary);
        this.durationMonths = durationMonths;

    }

    @Override
    public double calculateMonthlyBonus() {
        return 250.0f;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "| Duration : " + durationMonths + "months";
    }
}