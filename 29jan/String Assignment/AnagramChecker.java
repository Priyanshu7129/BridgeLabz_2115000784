import java.util.Scanner;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq1 = new int[256]; 
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq1[ch]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq1[ch]--;
            if (freq1[ch] < 0) {
                return false; 
            }
        }
        return true; 
    }
}
