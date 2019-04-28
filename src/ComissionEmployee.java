class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            System.out.println(commissionRate);
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
//         System.out.println(commissionRate);


    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    @Override
    public void raise(double percent) {
        this.commissionRate = (commissionRate + (percent * commissionRate));

    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }



    //"%s: %s %s %s %s%n"
    @Override
    public String toString() {
        return String.format("%s: %s %s %s %s%n %s: %.3f%n %s: %.3f%n %s: %.3f%n",
                "Commissioned employee", getFirstName(), getLastName(),"with ssn",getSocialSecurityNumber(),
                "Gross Sales", getGrossSales(),
                "Commision Rate", getCommissionRate(),
                "Earnings", earnings());

    }
}
