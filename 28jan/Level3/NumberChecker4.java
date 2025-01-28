import java.util.*;
public class NumberChecker4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("This is a Prime Number.");
        } else {
            System.out.println("This is not a prime number.");
        }
        if (isNeonNumber(n)) {
            System.out.println("This is a Neon Number.");
        } else {
            System.out.println("This is not a Neon Number.");
        }
        if (isSpyNumber(n)) {
            System.out.println("This is a Spy Number.");
        } else {
            System.out.println("This is not a Spy Number.");
        }
        if (isAutomorphicNumber(n)) {
            System.out.println("This is a Automorphic Number.");
        } else {
            System.out.println("This is not a Automorphic Number.");
        }
        if (isBuzzNumber(n)) {
            System.out.println("This is a Buzz Number.");
        } else {
            System.out.println("This is not a Buzz Number.");
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNeonNumber(int n) {
        int digits[] = storeDigits(n * n);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum == n;
    }

    public static boolean isSpyNumber(int n) {
        int sum = 0;
        int prod = 1;

        int digits[] = storeDigits(n);
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
            prod *= digits[i];
        }

        return sum == prod;
    }
    
    public static boolean isAutomorphicNumber(int n) {
        int digits[] = storeDigits(n);
        int sqDigits[] = storeDigits(n * n);

        int i = digits.length - 1;
        int j = sqDigits.length - 1;
        while (i >= 0 && j >= 0) {
            if (digits[i--] != sqDigits[j--]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isBuzzNumber(int n) {
        return (n % 7 == 0 || n / 10 == 7);
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

    public static int countDigits(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}