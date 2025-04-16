/*
Program 05
Write a program that take initial values of students Roll Number, Name, and total marks secured in 5 subjects print his/her result as follows:
a. If percentage >= 70 then result = “Distinction”
b. If percentage >= 60 and < 70 then result = “First Class”
c. If percentage >= 50 and < 60 then result = “Second Class”
d. If percentage >= 40 and < 50 then result = “Pass Class”
e. Else result = “Fail”.
*/

import java.util.Scanner;

public class Mark 
{
   public static void main(String[] args) 
   {

      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Roll Number: ");
      int rollNumber = sc.nextInt();
     
      System.out.print("Enter Name: ");
      String name = sc.next();
     
      System.out.print("Enter marks in subject 1: ");
      int subject1 = sc.nextInt();
     
      System.out.print("Enter marks in subject 2: ");
      int subject2 = sc.nextInt();
     
      System.out.print("Enter marks in subject 3: ");
      int subject3 = sc.nextInt();
     
      System.out.print("Enter marks in subject 4: ");
      int subject4 = sc.nextInt();
     
      System.out.print("Enter marks in subject 5: ");
      int subject5 = sc.nextInt();
     
      int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
      double percentage = (totalMarks / 500.0) * 100;

      String result = "";

      if (percentage >= 70) 
      {
         result = "Distinction";
      } else if (percentage >= 60) 
      {
         result = "First Class";
      } else if (percentage >= 50) 
      {
         result = "Second Class";
      } else if (percentage >= 40) 
      {
         result = "Pass Class";
      } else {
         result = "Fail";
      }
      
      System.out.println("Roll Number: " + rollNumber);
      System.out.println("Name: " + name);
      System.out.println("Total Marks: " + totalMarks);
      System.out.println("Percentage: " + percentage);
      System.out.println("Result: " + result);
   }
}

/*
run:
Enter Roll Number: 12
Enter Name: Utam
Enter marks in subject 1: 70
Enter marks in subject 2: 85
Enter marks in subject 3: 99
Enter marks in subject 4: 90
Enter marks in subject 5: 70
Roll Number: 12
Name: Utam
Total Marks: 414
Percentage: 82.8
Result: Distinction
*/