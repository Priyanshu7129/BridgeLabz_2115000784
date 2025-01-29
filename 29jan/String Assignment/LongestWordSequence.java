import java.util.Scanner;
public class LongestWordSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
 
        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);
    }    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
