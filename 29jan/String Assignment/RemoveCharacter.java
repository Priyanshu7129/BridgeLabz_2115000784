import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);
        StringBuilder modifiedString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (c != charToRemove) {
                modifiedString.append(c);
            }
        }
        System.out.println("Modified String: " + modifiedString.toString());
    }
}