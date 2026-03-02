import java.util.Scanner;

public class UC9 {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition 1: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Move towards center
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Convert to lowercase (case-insensitive check)
        input = input.toLowerCase();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}