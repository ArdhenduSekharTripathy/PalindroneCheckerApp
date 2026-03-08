import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    public static boolean checkUsingReverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return input.equals(reversed);
    }

    public static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkUsingDeque(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = checkUsingDeque(input);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time (Reverse): " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Execution Time (Stack): " + (end2 - start2) + " ns");

        System.out.println("Deque Method Result: " + result3);
        System.out.println("Execution Time (Deque): " + (end3 - start3) + " ns");

        scanner.close();
    }
}