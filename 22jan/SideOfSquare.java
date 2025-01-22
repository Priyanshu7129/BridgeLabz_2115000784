import java.util.Scanner;
public class SideOfSquare{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the perimeter of rectangle: ");
                float peri = sc.nextFloat();
                float side = peri / 4;
                System.out.print("The length of side is " + side + " whose perimeter is " + peri);
}
}

