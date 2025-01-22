import java.util.Scanner;
public class kilometerToMile{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                double km = sc.nextDouble();

                double miles = km  /1.6;
                System.out.print("The total miles is " + miles + " miles for the given " + km + " km");

}
}

