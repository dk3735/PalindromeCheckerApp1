import java.util.*;

// Strategy Interface
interface UC12 {
    boolean checkPalindrome(String str);
}

// Stack-based implementation
class StackStrategy implements UC12 {
    @Override
    public boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based implementation
class DequeStrategy implements UC12 {
    @Override
    public boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class to inject strategy
class PalindromeContext {
    private UC12 strategy;

    public PalindromeContext(UC12 strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(UC12 strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String str) {
        return strategy.checkPalindrome(str);
    }
}

// Main Application
public class UC12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Strategy Pattern Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy: 1-Stack, 2-Deque");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        UC12 strategy;
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);
        boolean result = context.executeStrategy(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}