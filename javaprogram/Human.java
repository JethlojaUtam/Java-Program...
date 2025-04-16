/*
Program 11
Define class Human with first name and last name. 
Define new class Student which is derived from Human and has new field – grade. 
Define class Worker derived from Human with new field weekSalary and work-hours per day and method MoneyPerHour() 
that returns money earned by hour by the worker. Define the proper constructors and properties for this hierarchy. 
Create object and demonstrate.
*/

class Human1 {
    private String first_name;
    private String last_name;   

    public Human1(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    void display() {
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
    }
}

class Student1 extends Human1 {
    private String grade;

    public Student1(String first_name, String last_name, String grade) {
        super(first_name, last_name);
        this.grade = grade;
    }

    void display() {
        super.display();
        System.out.println("Grade: " + grade);        
    }
}

class Worker extends Human1 {
    private int weekSalary;
    private int work_hours;

    public Worker(String first_name, String last_name, int weekSalary, int work_hours) {
        super(first_name, last_name);
        this.weekSalary = weekSalary;
        this.work_hours = work_hours;        
    }

    int MoneyPerHour() {
        return weekSalary / (work_hours * 5);
    }

    void display() {
        super.display();
        System.out.println("Week Salary: " + weekSalary);        
        System.out.println("Work Hours per Day: " + work_hours);        
    }
}

public class Human{
    public static void main(String args[]) {
        Human1 h1 = new Human1("Utam", "Patel");
        h1.display();

        System.out.println();
        
        Student1 s1 = new Student1("Utam", "Patel", "A+");
        s1.display();
        
        System.out.println();
        
        Worker w1 = new Worker("Utam", "Patel", 100000, 15);
        w1.display();
        
        System.out.println("Money Per Hour: " + w1.MoneyPerHour());
    }
}

/*
run:
First Name: Utam
Last Name: Patel

First Name: Utam
Last Name: Patel
Grade: A+

First Name: Utam
Last Name: Patel
Week Salary: 100000
Work Hours per Day: 15
Money Per Hour: 1333
*/