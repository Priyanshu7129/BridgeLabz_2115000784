import java.util.*;
public class NumberChecker1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Number of digits:" + countDigits(n));
        int digits[] = storeDigits(n);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        if (duckNumber(n)) {
            System.out.println("It is a Duck Number");
        } else {
            System.out.println("It is not a Duck Number");
        }
        if (isArmstrong(n)) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
        int l[] = largest(n);
        System.out.println("Largest:" + l[0]);
        System.out.println("Second Largest:" + l[1]);
        int s[] = smallest(n);
        System.out.println("Smallest:" + s[0]);
        System.out.println("Second Smallest:" + s[1]);
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
    public static boolean duckNumber(int n) {
        int ary[] = storeDigits(n);
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] != 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int n) {
        int digits[] = storeDigits(n);
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num += (int) Math.pow(digits[i], digits.length);
        }
        return num == n;
    }
    public static int[] largest(int n) {
        int digits[] = storeDigits(n);
        int lar = Integer.MIN_VALUE;
        int secLar = lar;
        for (int i = 0; i < digits.length; i++) {
            if (lar < digits[i]) {
                secLar = lar;
                lar = digits[i];
            }
        }
        return new int[] { lar, secLar };
    }
    public static int[] smallest(int n) {
        int digits[] = storeDigits(n);
        int small = Integer.MAX_VALUE;
        int secSmall = small;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < small) {
                secSmall = small;
                small = digits[i];
            }
        }

        return new int[] { small, secSmall };
    }
}
