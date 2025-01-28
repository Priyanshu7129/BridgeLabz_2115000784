import java.util.Scanner;
class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
}