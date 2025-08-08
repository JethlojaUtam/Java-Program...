import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to hold student info and marks
        String studentName;
        int[] marks = new int[5];
        int total = 0;
        double percentage;

        // Input student name
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Basic validation
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark entered. Please enter a value between 0 and 100.");
                i--; // retry this subject
                continue;
            }

            total += marks[i];
        }

        // Calculate percentage
        percentage = total / 5.0;

        // Output the result
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + studentName);
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Optional: grade output
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        scanner.close();
    }
}
