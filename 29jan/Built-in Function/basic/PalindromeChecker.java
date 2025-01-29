import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        String inputString = getInput();
        boolean isPalindrome = checkPalindrome(inputString);
        displayResult(inputString, isPalindrome);
    }
    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return sc.nextLine();
    }
    private static boolean checkPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    private static void displayResult(String inputString, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
