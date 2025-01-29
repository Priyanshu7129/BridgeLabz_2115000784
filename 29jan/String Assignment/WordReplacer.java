import java.util.Scanner;
public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        String modifiedSentence = sentence.replace(wordToReplace, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}