import java.util.*;
public class NumberChecker2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(n));
        int digits[] = storeDigits(n);
        System.out.println("Digits are:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of digits: " + sumOfDigits(n));
        System.out.println("Sum of square of digits: " + sumOfSquare(n));
        if (isHarshad(n)) {
            System.out.println("This is a Harshad Number");
        } else {
            System.out.println("This is not a Harshad Number");
        }
        System.out.println("Frequency of each digit:");
        int freq[][] = freqOfDigits(n);
        for (int i = 0; i < 10; i++) {
            System.out.println(freq[i][0] + "->" + freq[i][1]);
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
    public static int sumOfDigits(int n) {
        int digits[] = storeDigits(n);
        int s = 0;
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];
        }
        return s;
    }
    public static int sumOfSquare(int n) {
        int digits[] = storeDigits(n);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += (int) Math.pow(digits[i], 2);
        }
        return sum;
    }
    public static boolean isHarshad(int n) {
        int sum = sumOfDigits(n);
        return n % sum == 0;
    }
    public static int[][] freqOfDigits(int n){
        int digits[] = storeDigits(n);
        int freq[][] = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }
        return freq;
    }
}
