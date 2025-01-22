import java.util.Scanner;
public class FeeDiscount{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                double fee = sc.nextDouble();
                double discountPercent = sc.nextDouble();

                double discount = (fee * discountPercent) / 100;
                double discountedFee = fee - discount;

                System.out.print("The discount amount in INR " + discount + " and final discounted fee is INR " + discountedFee);
}
}

