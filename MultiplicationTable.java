public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 5; // Change this to any number you want the table of

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
