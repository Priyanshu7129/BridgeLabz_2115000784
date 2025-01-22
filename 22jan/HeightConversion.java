import java.util.Scanner;
public class HeightConversion{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter your height in centimeters: ");
                double heightCm = sc.nextDouble();

                double heightInch = heightCm / 2.54;
                double heightFoot = heightInch / 12;

                System.out.print("Your height in cm is " + heightCm + " while in feet is " + heightFoot + " and inches is " + heightInch);
}
}

