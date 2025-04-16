/*
Program 14
Create an abstract class "Shape" with an abstract method for calculating area. Create concrete subclasses 
like "Circle" and "Rectangle" that extend "Shape" and implement the area calculation. Demonstrate how to use these classes. 
*/

abstract class Shape2
{
        abstract double calarea();
}

class Circle1 extends Shape2
{
    double height;
    double width;

    public Circle1(double height,double width)
    {
        this.height = height;
        this.width = width;
    }
    public double calarea()
    {
        return height * width;
    }
    void display()
    {
        System.out.println("Area of Circle is :: "+calarea());
    }
}

class Rectangle1 extends Shape2
{
   double height;
   double width;

   public Rectangle1(double height,double width)
   {
        this.height = height;
        this.width = width;
   }
   public double calarea()
   {
        return height * width;
   }
   void display()
   {
        System.out.println("Area of Rectangle is :: "+calarea());
   }
}
public class Shape1
{
    public static void main(String args[])
    {
        Circle1 c1 = new Circle1(10,20);
        c1.display();
        Rectangle1 r1 = new Rectangle1(10,20);
        r1.display();
    }
}

/*
run:
Area of Circle is :: 200.0
Area of Rectangle is :: 200.0
*/