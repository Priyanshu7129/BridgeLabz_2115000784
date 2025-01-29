import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();

        char[] charArray1 = string1.replaceAll("\\s+", "").toCharArray();
        char[] charArray2 = string2.replaceAll("\\s+", "").toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}