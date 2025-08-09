public class ReverseWord {

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "Java";
        String output = reverse(input);
        System.out.println("Original Word: " + input);
        System.out.println("Reversed Word: " + output);
    }
}
