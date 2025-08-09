import java.util.Scanner;

public class ReverseWord1 {

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        String output = reverse(input);
        System.out.println("Reversed word: " + output);

        scanner.close();
    }
}
