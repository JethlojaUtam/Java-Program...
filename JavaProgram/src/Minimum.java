/*
Program 04
Input three numbers and find minimum among them.
*/

import java.util.Scanner;

public class Minimum 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
      
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
      
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
      
        double min = num1;
        if (num2 < min) 
        {
            min = num2;
        }
        if (num3 < min) 
        {
            min = num3;
        }
        System.out.println("Minimum number: " + min);
    }
}

/*
run:
Enter first number: 25
Enter second number: 8
Enter third number: 29
Minimum number: 8.0
*/