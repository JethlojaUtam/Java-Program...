/*
Program 13
Create a superclass "Animal" with properties like name and age. 
Create a subclass "Dog" that inherits from "Animal" and adds a breed property. Demonstrate the use of the superclass and subclass.
*/

class Animal1
{
    String name;
    int age;

    public Animal1(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void disp()
    {
        System.out.println("The Animal Name :: "+name);
        System.out.println("The Animal Age :: "+age);
    }
}

class Dog extends Animal1
{
    String breed;

    public Dog(String name,int age,String breed)
    {
        super(name,age);
        this.breed = breed;
    }
    void display()
    {
        System.out.println("The Animal Breed :: "+breed); 
    }
}

public class Animal
{
    public static void main(String args[])
    {
        Dog d1 = new Dog("XYZ",22,"ABC");
        d1.display();
        d1.disp();
    }
}

/*
run:
The Animal Breed :: ABC
The Animal Name :: XYZ
The Animal Age :: 22
*/