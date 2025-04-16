/*
Program 13
Create a class “Math_Operations” with overloaded methods for addition and multiplication. Demonstrate the use of method overloading by calling these methods with different argument types.
*/

class Math_Operation
{
    void addition(int a, int b)
    {
        System.out.println("Addition: " + (a + b));
    }

    void addition(double a, double b) 
    {
        System.out.println("Addition: " + (a + b));
    }

    void multiplication(int a, int b) 
    {
        System.out.println("Multiplication: " + (a * b));
    }

    void multiplication(double a, double b) 
    {
        System.out.println("Multiplication: " + (a * b));
    }
}

public class Math_Operations 
{
    public static void main(String[] args) 
    {
        Math_Operation m = new Math_Operation();
        m.addition(10, 5);
        m.addition(10.5, 5.5);
        m.multiplication(10, 5);
        m.multiplication(10.5, 5.5);
    }
}

/*
run:
Addition: 15
Addition: 16.0
Multiplication: 50
Multiplication: 57.75
*/

