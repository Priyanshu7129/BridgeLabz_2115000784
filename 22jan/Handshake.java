
import java.util.Scanner;
public class Handshake{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter the number of students: ");
                int numberOfStudents = sc.nextInt();
                int maxHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2;

                System.out.print("The maximum number of possible handshake among " + numberOfStudents + " students is " + maxHandshake);

}
}

