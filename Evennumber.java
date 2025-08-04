public class Evennumber {
    public static void main(String[] args) {

        int limit = 100;
        System.out.println("Even numbers from 1 to " + limit + ":");

        // Loop from 1 up to the limit
        for (int i = 1; i <= limit; i++) {
            
            // Check if the number is even
            if (i % 2 == 0) {
                // If it's even, print it
                System.out.println(i);
            }
        }
    }
}