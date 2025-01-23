import java.util.Scanner;
class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter age of Anthony: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        double anthonyHeight = sc.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        System.out.println("Youngest Friend's Age: " + youngestAge);
        System.out.println("Tallest Friend's Height: " + tallestHeight);
    }
}