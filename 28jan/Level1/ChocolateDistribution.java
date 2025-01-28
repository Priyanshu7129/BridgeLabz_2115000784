import java.util.Scanner;
class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();
        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child: " + result[0] + ", Remaining chocolates: " + result[1]);
    }
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        return new int[]{numberOfChocolates / numberOfChildren, numberOfChocolates % numberOfChildren};
    }
}