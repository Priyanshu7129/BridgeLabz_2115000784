import java.util.*;
public class NumberChecker3 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(n));
        int digits[] = storeDigits(n);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        int revDigits[] = reverseDigits(n);
        for (int i = 0; i < revDigits.length; i++) {
            System.out.print(revDigits[i] + " ");
        }
        System.out.println();

        if (isPalindrome(n)) {
            System.out.println("This is palindrome.");
        } else {
            System.out.println("This is not Palindrome.");
        }

        if (isDuckNumber(n)) {
            System.out.println("This is a Duck Number.");
        } else {
            System.out.println("This is not a Duck Number.");
        }
    }    
    public static int countDigits(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }

        return c;
    }
    public static int[] storeDigits(int n) {
        int size = countDigits(n);
        int ary[] = new int[size];
        int i = 0;
        while (n != 0) {
            ary[i++] = n % 10;
            n /= 10;
        }

        return ary;
    }
    public static int[] reverseDigits(int n) {
        int digits[] = storeDigits(n);
        int revDigits[] = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            revDigits[digits.length - 1 - i] = digits[i];
        }
        return revDigits;
    }

    public static boolean compare(int n) {
        int digits[] = storeDigits(n);
        int revDigits[] = reverseDigits(n);

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != revDigits[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        return compare(n);
    }

    public static boolean isDuckNumber(int n) {
        int ary[] = storeDigits(n);
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] != 0) {
                return true;
            }
        }
        return false;
    }
}
