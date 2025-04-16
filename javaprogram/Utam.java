/*
Program 20
Create a Java program that uses wrapper classes to convert primitive data types to
objects and vice versa. Perform operations like auto-unboxing and auto-boxing.
*/

import java.util.Scanner;

public class Utam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        Integer integer = num;
        System.out.println("Integer: " + integer);

        int num2 = integer;
        System.out.println("int: " + num2);

        scanner.close();
    }
}

/*
run:
Enter an integer: 25
Integer: 25
int: 25
