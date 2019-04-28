class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales,commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary)  {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void raise(double percent) {
        double x = (getCommissionRate() + (percent * getCommissionRate()));
        double y = (getBaseSalary() + (percent * getBaseSalary()));

        setCommissionRate(x);
        setBaseSalary(y);


    }

    // calculate earnings
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }



    @Override
    public String toString() {
        return String.format("%s: %s %s %s %s%n %s: %.3f%n %s: %.3f%n %s: %.3f%n %s: %.3f%n",
                "Base Salary Plus Commissioned employee", getFirstName(), getLastName(), "with ssn", getSocialSecurityNumber(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate(),
                "with Base Salary of", getBaseSalary(),
                "Earnings", earnings());
    }
}
