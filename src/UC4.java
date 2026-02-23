import java.util.Scanner;
public class UC4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("✅ The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("❌ The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}