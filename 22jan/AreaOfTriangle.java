import java.util.Scanner;
public class AreaOfTriangle{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the base of triangle ");
                float base = sc.nextFloat();
                System.out.print("enter the height of triangle ");
                float height = sc.nextFloat();

                float area = (base * height)/2;
                System.out.print("The area of triangle is " + area);
}
}

