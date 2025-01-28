import java.util.*;
public class NumberChecker5 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int factors[] = factors(n);
        System.out.println("Factors are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println("Greatest factor: " + greatestFactor(n));
        System.out.println("Sum of Factors: " + factorsSum(n));
        System.out.println("Product of factors: " + factorsProduct(n));
        System.out.println("Product of cube of it's factors: " + factorsCubeProduct(n));
        if (isPerfect(n)) {
            System.out.println("This number is Perfect Number.");
        } else {
            System.out.println("This number is not Perfect Number.");
        }
        if (isAbundant(n)) {
            System.out.println("This number is Abundant Number.");
        } else {
            System.out.println("This  number is not Abundant Number.");
        }
        if (isDeficient(n)) {
            System.out.println("This number is Deficient Number.");
        } else {
            System.out.println("This number is not Deficient Number.");
        }
        if (isStrong(n)) {
            System.out.println("This number is Strong Number.");
        } else {
            System.out.println("This number is not Deficient Number.");
        }
    }
    public static int[] factors(int n) {
        int f = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                f++;
            }
        }
        int factors[] = new int[f];
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[x++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int n) {
        int factors[] = factors(n);
        return factors[factors.length - 1];
    }
    public static int factorsSum(int n) {
        int factors[] = factors(n);

        int s = 0;
        for (int i = 0; i < factors.length; i++) {
            s += factors[i];
        }
        return s;
    }
    public static int factorsProduct(int n) {
        int factors[] = factors(n);

        int p = 1;
        for (int i = 0; i < factors.length; i++) {
            p *= factors[i];
        }
        return p;
    }
    public static long factorsCubeProduct(int n) {
        int factors[] = factors(n);
        long p = 1;
        for (int i = 0; i < factors.length; i++) {
            p *= (int) Math.pow(factors[i], 3);
        }
        return p;
    }
    public static boolean isPerfect(int n) {
        int factors[] = factors(n);

        int s = 0;
        for (int i = 0; i < factors.length; i++) {
            s += factors[i];
        }

        return s == n;
    }

    public static boolean isAbundant(int n) {
        int factors[] = factors(n);

        int s = 0;
        for (int i = 0; i < factors.length; i++) {
            s += factors[i];
        }

        return s > n;
    }

    public static boolean isDeficient(int n) {
        int factors[] = factors(n);

        int s = 0;
        for (int i = 0; i < factors.length; i++) {
            s += factors[i];
        }

        return s < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0;

        while (n > 0) {
            sum += fact(n % 10);
            n /= 10;
        }
        
        return sum == n;
    }
    
    public static int fact(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }
}
