/*
Program 03
Write program to input length and width and calculate the area of the rectangle.
*/

import java.util.Scanner;

public class Rectangle 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
      
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
      
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

/*
run:
Enter length: 5
Enter width: 3
Area of rectangle: 15.0
*/