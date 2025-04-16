/*
Program 09
Define a Java class “Person” with instance variables for name and age. Add a method to display the details. Create objects of this class and call the method.
*/

class Niketan 
{
    String name;
    int age;

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person 
{
    public static void main(String[] args) 
    {
        Niketan p1 = new Niketan();
        p1.name = "Utam";
        p1.age = 20;
        p1.display();
    }
}

/*
run:
Name: Utam
Age: 20
*/