import java.util.Scanner;

public class UppercaseStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        System.out.println("Strings in uppercase:");
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
    }
}