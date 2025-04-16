/* Program 01 
Create a class Rectangle having instance variable length and width of type double. 
Write a method to calculate area of rectangle. Set the value of length and width using setValue( ) method. 
Define area method to calculate area. Create an object of the class and display the area.
*/

class Rectangle
{
    double length;
    double width;

    double area()
    {
        return length*width;
    }
    void setValue(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        r1.setValue(10,5);
        System.out.println("Area of Rectangle is: "+r1.area());
    }
}

/*run:
Area of Rectangle is: 50.0
*/