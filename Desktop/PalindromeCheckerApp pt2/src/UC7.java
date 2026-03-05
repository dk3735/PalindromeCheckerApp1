
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UC7 {

    public static boolean isPalindrome(String input) {

        input = input.toLowerCase().replaceAll("\\s+", "");

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC7: Deque-Based Optimized Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}