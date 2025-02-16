import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to remove duplicates: ");
        String input = sc.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
    }
}
