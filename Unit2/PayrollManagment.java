class Employee
{
    protected String eName;
    protected double basicSalary;
    protected double Net_Income;
    static int Count;

    static
    {//Static Initializer Block
        Count = 0;
    }
    
    {//Initializer Block
        Count++;
    }

    public Employee(String Name, double BasicSalary)
    {//Default Contructor
        eName = Name;
        basicSalary = BasicSalary;
    }

    public Employee(String Name, int BasicSalary)
    {//Method ovrloading
        eName = Name;
        basicSalary = BasicSalary;
    }

    public Employee(Employee e1)
    {//Copy Contructor
        this(e1.eName, e1.basicSalary);
    }

    void print_Emplyoee_details()
    {//Prints the details
        System.out.println("\nEmployee Name: " + eName + "\nBasic Salary " + basicSalary);
    }

    void getNetIncome()
    {//Counting Net Income
        Net_Income = basicSalary + 0.4*basicSalary + 0.2*basicSalary;
        System.out.println(eName + "'s Net Income is: " + Net_Income);
    }

    public void setSalary(double BasicSalary)
    {//stter method 
        basicSalary = BasicSalary ;
    }

    public double getSalary()
    {//getter method
        return basicSalary;
    }

     static int countEmployee()
    {//Static method to check total numbers of account created
        System.out.println("\nNumbers of Employees are: " + Count);
        return Count;
    }

}

class SalesManager extends Employee
{
    private double salesAmount;

    public SalesManager(String Name, double BasicSalary, double SalesAmount)
    {
        super(Name, BasicSalary);
        eName = Name;
        basicSalary = BasicSalary;
        salesAmount = SalesAmount;
    }

    public SalesManager(String Name, int BasicSalary, int SalesAmount)
    {
        super(Name, BasicSalary);
        eName = Name;
        basicSalary = BasicSalary;
        salesAmount = SalesAmount;
    }

    public SalesManager(SalesManager s1)
    {//Copy Contructor
        this(s1.eName, s1.basicSalary, s1.salesAmount);
    }

    void print_Emplyoee_details()
    {
        System.out.println("\nSales Manager Name: " + eName + "\nBasic Salary: " + basicSalary + "\nSales Amount: " + salesAmount);
    }

    void getNetIncome(Employee e1)
    {//Counting Net Income
        Net_Income = e1.getSalary() + 0.05*salesAmount;
        System.out.println("Net Income: " + Net_Income);
    }
}


public class PayrollManagment
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee("Parth", 550000000);
        Employee e2 = new Employee("Anshul", 550000000);
        SalesManager s1 = new SalesManager("Rhythm", 500000000, 50000000);
        SalesManager s2 = new SalesManager("Smit", 500000000, 50000000);
        
        Employee[] Employees = {e1, e2, s1, s2};

        for (int i=0; i<Employees.length; i++)
        {
            Employees[i].print_Emplyoee_details();
        }

        Employee.countEmployee();

        for (int i=0; i<Employees.length; i++)
        {
            Employees[i].getNetIncome();
        }

    }
}
