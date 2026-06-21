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
