import java.util.Scanner;
class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
}