/*
Program 07
Write a menu driven program which has following operations:
a. Factorial.
b. Number is Even or Odd.
c. Exit.
*/

import java.util.Scanner;

public class Choice 
{
   public static void main(String[] args) 
   {

      Scanner sc = new Scanner(System.in);

      while (true) 
      {
         System.out.println("1. Factorial");
         System.out.println("2. Number is Even or Odd");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();

         switch (choice) 
         {
            case 1:
               System.out.print("Enter a number: ");
               int num = sc.nextInt();
               int fact = 1;
               for (int i = 1; i <= num; i++) 
               {
                  fact *= i;
               }
               System.out.println("Factorial of " + num + " is " + fact);
               break;
            case 2:
               System.out.print("Enter a number: ");
               int number = sc.nextInt();
               if (number % 2 == 0) 
               {
                  System.out.println(number + " is even");
               } else 
               {
                  System.out.println(number + " is odd");
               }
               break;
            case 3:
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice");
         }
      }
   }
}

/*
run:
1. Factorial
2. Number is Even or Odd
3. Exit
Enter your choice: 1
Enter a number: 6
Factorial of 6 is 720
1. Factorial
2. Number is Even or Odd
3. Exit
Enter your choice: 2
Enter a number: 13
13 is odd
1. Factorial
2. Number is Even or Odd
3. Exit
Enter your choice: 3
Exit
*/


