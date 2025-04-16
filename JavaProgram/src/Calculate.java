/*
Program 11
Create a class “Calculator” with methods for addition, subtraction, multiplication, and division that take two arguments. Create instances of this class and pass arguments to these methods.
*/

class Calculator 
{
    void addition(int a, int b) 
    {
        System.out.println("Addition: " + (a + b));
    }

    void subtraction(int a, int b) 
    {
        System.out.println("Subtraction: " + (a - b));
    }

    void multiplication(int a, int b) 
    {
        System.out.println("Multiplication: " + (a * b));
    }

    void division(int a, int b) 
    {
        System.out.println("Division: " + (a / b));
    }
}

public class Calculate 
{
    public static void main(String[] args) 
    {
        Calculator c = new Calculator();
        c.addition(10, 5);
        c.subtraction(10, 5);
        c.multiplication(10, 5);
        c.division(10, 5);
    }
}

/*
run:
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
*/
