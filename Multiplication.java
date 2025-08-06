import java.util.Scanner; // Import the Scanner class to read user input

public class Multiplication {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read the first integer

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read the second integer

        // Calculate the sum
        int multiply = num1 * num2;

        // Print the sum
        System.out.println("The multiplication is: " + multiply);

        // Close the scanner to release system resources
        scanner.close();
    }
}