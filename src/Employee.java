public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;


    public Employee(){ this("","","");
    }
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

    }


    public  String getFirstName()  {
        return firstName;
    }

    public String getLastName()  {
        return lastName;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public abstract double earnings();
    public abstract void raise(double percent);



    public static void main(String[] args){
//        Employee employee9 = new Employee();

        CommissionEmployee employee1 = new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .05);
        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222",3000, .05, 300);
        SalariedEmployee employee3 = new SalariedEmployee("Shan", "Yang", "333-33-3333", 1150.0);
        HourlyEmployee employee4 = new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50);
        HourlyEmployee employee5 = new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40);
//        System.out.printf("%s", employee9);
        System.out.printf("%s%s%s%s%s", employee1, employee2, employee3, employee4, employee5);




        Employee[] employeesArray = new Employee[]{employee1,employee2,employee3,employee4,employee5};
        for (Employee employee: employeesArray){
            if (employee instanceof SalariedEmployee){
                employee.raise(0.04);
            }
            else{
                employee.raise(0.02);
            }


        }
        System.out.printf("%s%s%s%s%s", employee1, employee2, employee3, employee4, employee5);

    }



}


