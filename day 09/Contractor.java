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
