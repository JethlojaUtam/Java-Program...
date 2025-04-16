/*
Program 18
Create an interface "Shape" with methods for calculating area and perimeter. 
Implement this interface in classes like "Circle" and "Rectangle."
Demonstrate how classes implement interfaces.
*/ 

interface Shapes 
{
    double calculateArea();      
    double calculatePerimeter(); 
}

class Circle3 implements Shapes
{
    double radius;

    public Circle3(double radius) 
    {
        this.radius = radius;
    }
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle2 implements Shapes 
{
    double length, width;

    public Rectangle2(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() 
    {
        return length * width;
    }
    public double calculatePerimeter() 
    {
        return 2 * (length + width);
    }
}
public class Shape3 
{
    public static void main(String[] args) 
    {
        Shapes circle = new Circle3(5); 
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Shapes rectangle = new Rectangle2(4, 6); 
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}