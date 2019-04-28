class SalariedEmployee extends Employee {
    private double annualSalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double annualSalary){
        super(firstName, lastName, socialSecurityNumber);
        if (annualSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.annualSalary = annualSalary;



    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public void raise(double percent) {
        this.annualSalary = annualSalary + (percent * annualSalary);

    }

    @Override
    public double earnings() {
        return getAnnualSalary();
    }



    @Override
    public String toString() {
        return String.format("%s: %s %s %s %s%n %s: %.3f%n %s: %.3f%n ",
                "Salaried employee", getFirstName(), getLastName(),"with ssn",getSocialSecurityNumber(),
                "Salary ", getAnnualSalary(),
                "Earnings", earnings());

    }
}
