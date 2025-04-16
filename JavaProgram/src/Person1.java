/*
Program 10
Extend the “Person” class from the previous exercise. Create multiple “Person” objects, set their attributes, and display their details.
*/

class Adarsh 
{
    String name;
    int age;

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person1 
{
    public static void main(String[] args) 
    {
        Adarsh p1 = new Adarsh();
        p1.name = "Utam";
        p1.age = 20;
        p1.display();

        Adarsh p2 = new Adarsh();
        p2.name = "Adarsh";
        p2.age = 19;
        p2.display();

        Adarsh p3 = new Adarsh();
        p3.name = "Niketan";
        p3.age = 20;
        p3.display();
    }
}

/*
run:
Name: Utam
Age: 20
Name: Adarsh
Age: 19
Name: Niketan
Age: 20
*/
