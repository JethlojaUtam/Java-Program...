/*
Program 08
Input five numbers as command line arguments and store those numbers into an array and print all elements as output.
*/

import java.util.Scanner;

public class Number 
{
   public static void main(String[] args) 
   {

      Scanner sc = new Scanner(System.in);

      int[] numbers = new int[5];

      for (int i = 0; i < 5; i++) 
      {
         System.out.print("Enter The Number: ");
         numbers[i] = sc.nextInt();
      }

      System.out.println("Numbers:");
      for (int i = 0; i < 5; i++) 
      {
         System.out.println(numbers[i]);
      }
   }
}

/*
run:
Enter The Number: 25
Enter The Number: 13
Enter The Number: 31
Enter The Number: 29
Enter The Number: 16
Numbers:
25
13
31
29
16
*/