public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker App!");
        System.out.println("Version: 1.0.0");
        System.out.println("This app checks whether a string is a palindrome.");
    }
}

void main() {
    import java.util.Scanner;

    public class UseCase10PalindromeCheckerApp {
        public static boolean isPalindrome(String str) {

            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Case-Insensitive & Space-Ignored Palindrome Checker ===");
            System.out.print("Enter a string: ");

            String input = scanner.nextLine();

            input = input.toLowerCase();

            input = input.replaceAll("\\s+", "");

            boolean result = isPalindrome(input);

            if (result) {
                System.out.println("Result: The string is a Palindrome.");
            } else {
                System.out.println("Result: The string is NOT a Palindrome.");
            }

            scanner.close();
        }
    }
}