/*
Program 16
Create a class with instance variables and methods. Inside the methods, use this keyword to differentiate between instance variables and method parameters. Demonstrate this with object creation and method calls.
*/

class Utams
{
    String name;
    int age;

    void display(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Utam {
    public static void main(String[] args) {
        Utams p1 = new Utams();
        p1.display("Utam Patel", 20);
    }
}

/*
run:
Name: Utam Patel
Age: 20
*/