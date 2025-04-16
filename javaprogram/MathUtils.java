/*
Program 16
Create a class "MathUtils" with a final method that calculates the square of a number. 
Try to extend this class and override the final method, and explain the error that occurs.
*/

class MathUtils1
{
    double number;

    public MathUtils1(double number)
    {
        this.number = number;
    }
    public double calu()
    {
        return number * number;
    }
    void display()
    {
        System.out.println("Squre of Number is :: "+calu());
    }
}

public class MathUtils
{
    public static void main(String args[])
    {
        MathUtils1 m1 = new MathUtils1(5);
        m1.display();
    }
}

/*
run:
Squre of Number is :: 25.0
*/