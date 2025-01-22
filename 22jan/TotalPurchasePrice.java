import java.util.Scanner;
public class TotalPurchasePrice{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the unit price of an item: ");
                float unitPrice = sc.nextFloat();

                System.out.print("enter the number of quantity purchased: ");
                int quantity = sc.nextInt();

                float totalCost = quantity * unitPrice;
                System.out.print("The total purchase price is INR " + totalCost + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

}
}

