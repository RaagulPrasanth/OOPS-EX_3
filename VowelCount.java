package sample5;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a paragraph: ");
        String input = sc.nextLine();

        String vowels = "aeiouAEIOU";
        StringBuilder vowelList = new StringBuilder();
        StringBuilder consonantList = new StringBuilder();
        int vowelCount = 0, consonantCount = 0;

        // Loop through each character in the input
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if it's a letter
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelList.append(ch).append(", ");
                    vowelCount++;
                } else {
                    consonantList.append(ch).append(", ");
                    consonantCount++;
                }
            }
        }

        // Display results
        System.out.println("\nVowels are: " + vowelList.toString() + "Total = " + vowelCount);
        System.out.println("Consonants are: " + consonantList.toString() + "Total = " + consonantCount);

        sc.close();
    }
}
