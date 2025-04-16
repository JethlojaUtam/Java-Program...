/*
Program 12
Modify the “Person” class to include a parameterized constructor. Create objects using the constructor and display their details.
*/
class Persons 
{
    String name;
    int age;

    Persons(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person2 
{

    public static void main(String[] args) 
    {
        Persons p1 = new Persons("Utam", 20);
        p1.display();

        Persons p2 = new Persons("Adarsh", 19);
        p2.display();

        Persons p3 = new Persons("Niketan", 20);
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
