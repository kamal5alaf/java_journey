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
