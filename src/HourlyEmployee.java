class HourlyEmployee extends Employee{
    private double hourlywage;
    private float hoursworked;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlywage,int hoursworked){
        super(firstName, lastName, socialSecurityNumber);
        if (hourlywage < 0.0)
            throw new IllegalArgumentException("Hourly Wage must be >= 0.0");
        this.hourlywage = hourlywage;
        if (hoursworked < 0.0 | hoursworked > 168.0)
            throw new IllegalArgumentException("Hourly Wage must be > 0.0 and < 168.0");
        this.hoursworked = hoursworked;


    }



    public void setHourlywage(float hourlywage){
        this.hourlywage = hourlywage;

    }
    public void setHoursworked(float hoursworked){
        this.hoursworked = hoursworked;

    }

    public double getHourlywage() {
        return hourlywage;
    }

    public float getHoursworked() {
        return hoursworked;
    }

    @Override
    public void raise(double percent) {
        this.hourlywage = (hourlywage + (hourlywage*percent));


    }

    @Override
    public double earnings(){
        if (getHoursworked() > 40) {
            return ((getHoursworked() - 40) * 1.5 * getHourlywage() + ( 40 * getHourlywage()));
        }
        return getHoursworked() * getHourlywage();
    }




    @Override
    public String toString() {
        return String.format("%s: %s %s %s %s%n %s: %.3f%n %s: %.3f%n %s: %.3f%n",
                "Hourly employee", getFirstName(), getLastName(),"with ssn",getSocialSecurityNumber(),
                "Hourly Wage", getHourlywage(),
                "Hourls Worked", getHoursworked(),
                "Earnings", earnings());

    }
}
