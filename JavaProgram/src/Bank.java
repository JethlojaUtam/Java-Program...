/*
Program 14
Create a class “Bank” with a static variable for bank name and a static method to display it. Demonstrate how to access the static members of the class.
*/

class Banks 
{
    static String bankName = "SBI";

    static void display() 
    {
        System.out.println("Bank Name: " + bankName);
    }
}

public class Bank 
{
    public static void main(String[] args) 
    {
        Banks.display();
    }
}

/*
run:
Bank Name: SBI
*/
