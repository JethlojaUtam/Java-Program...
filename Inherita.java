//Java program in constructor with hierarchical inheritance...

class Person1
{
    String name;
    Person1(String name)
    {
        this.name=name;
    }
}
class Employee extends Person1
{
    int empid;
    String Dept;
    Employee(String name, int empid, String Dept)
    {
        super(name);
        this.empid=empid;
        this.Dept=Dept;
    }
    void display()
    {
        System.out.println("Employee Name is:"+name);
        System.out.println("Employee id is:"+empid);
        System.out.println("Employee Department is:"+Dept);
    }
}
class PartTime extends Employee
{
    int Workhr,rate;
    PartTime(String name, int empid, String Dept, int Workhr, int rate)
    {
        super(name, empid, Dept);
        this.Workhr=Workhr;
        this.rate=rate;
    }
    void display()
    {
        super.display();
        System.out.println("Employee Workhr is:"+Workhr);
        System.out.println("Employee Rate is:"+rate);
    }
    void countPay()
    {
        System.out.println("Employee Countpay is:"+(Workhr*rate));
        System.out.println();
    }
}
class FullTime extends Employee
{
    int monthlysal;
    FullTime(String name, int empid, String Dept, int monthlysal)
    {
        super(name, empid, Dept);
        this.monthlysal=monthlysal;
    }
    void display()
    {
        super.display();
        System.out.println("Employee Monthlusalary is:"+monthlysal);
    }
    void netSalary()
    {
        System.out.println("Employee Netsalary is:"+(monthlysal*12));
    }
}
public class Inherita 
{
    public static void main(String[] argd)
    {
        PartTime p1=new PartTime("Utam",1,"Math",12,2);
        FullTime f1=new FullTime("Adarsh",2,"CA",1000);
        p1.display();
        p1.countPay();
        f1.display();
        f1.netSalary();
    }
}

/*
run time output:
Employee Name is:Utam
Employee id is:1
Employee Department is:Math
Employee Workhr is:12
Employee Rate is:2
Employee Countpay is:24

Employee Name is:Adarsh
Employee id is:2
Employee Department is:CA
Employee Monthlusalary is:1000
Employee Netsalary is:12000
*/