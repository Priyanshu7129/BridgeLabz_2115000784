import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int[] frequency = new int[256];
        char mostFrequentChar = inputString.charAt(0);
        int maxFrequency = 0;

        for (char c : inputString.toCharArray()) {
            frequency[c]++;
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequentChar = c;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}