import java.util.Scanner;
public class SumNaturalNumbers {    
    public static boolean isNaturalNumber(int n) {
        return n > 0;
    }
    public static int sumNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumbersRecursive(n - 1);
        }
    }
    public static int sumNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (!isNaturalNumber(n)) {
            System.out.println("The input is not a natural number. Exiting.");
            return;
        }
        
        int recursiveSum = sumNaturalNumbersRecursive(n);
        int formulaSum = sumNaturalNumbersFormula(n);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);        
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is error between the two methods.");
        }
    }
}