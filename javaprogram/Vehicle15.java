/*
Program 15
Create a superclass "Vehicle" with a method "startEngine." Create subclasses "Car" and "Motorcycle" that 
override the "startEngine" method to provide their own implementation. Demonstrate method overriding.
*/

class Vehicle2
{
    public void startEngine()
    {
        System.out.println("The Engine is Started......");
    }
}

class Car1 extends Vehicle2
{

    public void startEngine()
    {
        System.out.println("The Car Engine is Started XYZ...");
    }
}

class Motorcycle1 extends Vehicle2
{
    public void startEngine()
    {
        System.out.println("The Motercycle Engine is Started ABC...");
    }
}

public class Vehicle15
{
    public static void main(String args[])
    {
        Car1 c1 = new Car1();
        c1.startEngine();
        
        Motorcycle1 m1 = new Motorcycle1();
        m1.startEngine();
    }
}