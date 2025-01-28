import java.util.Scanner;
class NumberSignChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = checkNumberSign(number);
        System.out.println("Result: " + result);
    }
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }
}