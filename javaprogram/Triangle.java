/*
Program 03
Write a Java program which creates the Triangle class with two attributes base and height of type float or double. 
Takes the two constructors of the Triangle class. First constructor takes the default value for base and height and 
Second Constructor takes base and height as a parameter. Create a method calcArea() to calculate the area of the Triangle. 
Define a main method and create objects to the class and print the area of the Triangle.
*/

class Triangle
{
    float base;
    float height;

    public Triangle()
    {
        this.base = 50;
        this.height = 20;

    }
    public Triangle(float base, float height)
    {
        this.base = base;
        this.height = height;
    }
    double calcArea()
    {
        return 0.5 * base * height;
    }
    public static void main(String args[])
    {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(10,25);

        System.out.println("Area of Triangle is : "+t1.calcArea());
        System.out.println("Area of Triangle is : "+t2.calcArea());
    }
}

/*
run:
Area of Triangle is : 500.0
Area of Triangle is : 125.0
*/