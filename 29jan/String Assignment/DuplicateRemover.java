import java.util.Scanner;
public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }
    public static String removeDuplicates(String str) {
        String uniqueStr = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!containsChar(uniqueStr, currentChar)) {
                uniqueStr += currentChar; 
            }
        }
        return uniqueStr;
    }
    public static boolean containsChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
