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