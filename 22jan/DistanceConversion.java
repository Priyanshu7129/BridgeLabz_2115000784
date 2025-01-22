import java.util.Scanner;
public class DistanceConversion{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the distance in feets: ");
                float distFeets = sc.nextFloat();
                float distYards = distFeets / 3;
                float distMiles = distYards / 1760;

                System.out.print("The distance in Feets is " + distFeets + " while in yards is " + distYards + " and miles is " + distMiles);
}
}

