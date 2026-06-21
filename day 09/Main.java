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

