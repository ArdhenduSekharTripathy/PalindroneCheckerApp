public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Hardcoded string (String Literal)
        String original = "madam";

        // 2. Logic to reverse the string
        // We use StringBuilder for easy string manipulation
        String reversed = new StringBuilder(original).reverse().toString();

        // 3. Conditional Statement (if-else) to check palindrome
        // Note: Use .equals() for string comparison, not ==
        if (original.equals(reversed)) {
            System.out.println("The word '" + original + "' is a palindrome.");
        } else {
            System.out.println("The word '" + original + "' is NOT a palindrome.");
        }

        // 4. Program exits automatically after main ends
    }
}
