/*
Program 12
Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with 
subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. 
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
*/

class Vehicle1
{
}
class Truck extends Vehicle
{
    String make;
    String model;
    int year;
    String fuel_type;

    public Truck(String make,String model,int year,String fuel_type)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    }
    int fuel_efficiency()
    {
        return 15;
    }
    double distance(int fuel)
    {
        return fuel * fuel_efficiency();
    }
    int maximum_speed()
    {
        return 150;
    }
    void display()
    {
        System.out.println("Enter The Making: "+make);
        System.out.println("Enter The Model: "+model);
        System.out.println("Enter The Year: "+year);
        System.out.println("Enter The Fual Type: "+fuel_type);
    }
}

class Car extends Vehicle
{
    String make;
    String model;
    int year;
    String fuel_type;

    public Car(String make,String model,int year,String fuel_type)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    } 
    int fuel_efficiency()
    {
        return 20;
    }
    double distance(int fuel)
    {
        return fuel * fuel_efficiency();
    }
    int maximum_speed()
    {
        return 200;
    }
    void display()
    {
        System.out.println("Enter The Making: "+make);
        System.out.println("Enter The Model: "+model);
        System.out.println("Enter The Year: "+year);
        System.out.println("Enter The Fual Type: "+fuel_type);
    }
}

class Motorcycle extends Vehicle
{
    String make;
    String model;
    int year;
    String fuel_type;
    
    public Motorcycle(String make,String model,int year,String fuel_type)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    }
    int fuel_efficiency()
    {
        return 35;
    }
    double distance(int fuel)
    {
        return fuel * fuel_efficiency();
    }
    int maximum_speed()
    {
        return 120;
    }
    void display()
    {
        System.out.println("Enter The Making: "+make);
        System.out.println("Enter The Model: "+model);
        System.out.println("Enter The Year: "+year);
        System.out.println("Enter The Fual Type: "+fuel_type);
    }
}

public class Vehicle
{
    public  static void main(String args[])
    {
        Truck t1 = new Truck("Tata","Tata 407",2024,"Petrol");
        t1.display();
        System.out.println("Fuel Efficiency: " + t1.fuel_efficiency());
        System.out.println("Distance Traveled with 10L: " + t1.distance(10));
        System.out.println("Max Speed: " + t1.maximum_speed());
        System.out.println();

        Car c1 = new Car("Volkswagen","Virtus",2024,"Petrol");
        c1.display();
        System.out.println("Fuel Efficiency: " + c1.fuel_efficiency());
        System.out.println("Distance Traveled with 10L: " + c1.distance(10));
        System.out.println("Max Speed: " + c1.maximum_speed());
        System.out.println();
        
        Motorcycle m1 = new Motorcycle("YAMAHA","FZ",2024,"Petrol");
        m1.display();
        System.out.println("Fuel Efficiency: " + m1.fuel_efficiency());
        System.out.println("Distance Traveled with 10L: " + m1.distance(10));
        System.out.println("Max Speed: " + m1.maximum_speed());
    }
}

/*
run:
Enter The Making: Tata
Enter The Model: Tata 407
Enter The Year: 2022
Enter The Fual Type: Petrol
Fuel Efficiency: 15
Distance Traveled with 10L: 150.0
Max Speed: 150

Enter The Making: Volkswagen
Enter The Model: Virtus
Enter The Year: 2024
Enter The Fual Type: Petrol
Fuel Efficiency: 20
Distance Traveled with 10L: 200.0
Max Speed: 200

Enter The Making: YAMAHA
Enter The Model: FZ
Enter The Year: 2024
Enter The Fual Type: Petrol
Fuel Efficiency: 35
Distance Traveled with 10L: 350.0
Max Speed: 120
*/