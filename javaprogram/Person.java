/*
Program 17
Create a class "Person" with an instance variable "name." Create a subclass "Employee" with its instance variable "employeeId." 
Use the "super" keyword to access the "name" variable from the "Person" class within the "Employee" constructor.
*/

class Person1
{
    String name;

    public Person1(String name)
    {
        this.name = name;
    }
    void disp()
    {
        System.out.println("The Person Name is :: "+name);
    }
}

class Employee extends Person1
{
    int emp_id;

    public Employee(String name,int emp_id)
    {
        super(name);
        this.emp_id = emp_id;
    }
    void display()
    {
        System.out.println("The Person Name is: "+name);
        System.out.println("The Employee Id is: "+emp_id);
    }

}
public class Person
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("Bhargav",25);
        e1.display();
    }
}

/*
run:
The Person Name is: Bhargav
The Employee Id is: 25
*/