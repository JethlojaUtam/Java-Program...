/*
Program 06
Write a Java program which accepts any number from command prompt and displays the table of multiplication from 1 to 10 of that number.
*/

import java.util.Scanner;

public class Table 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
      
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
} 

/*
run:
Enter a number: 1
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
1 * 5 = 5
1 * 6 = 6
1 * 7 = 7
1 * 8 = 8
1 * 9 = 9
1 * 10 = 10
*/