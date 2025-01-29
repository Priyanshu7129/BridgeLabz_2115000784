import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int guess = 0;
        String feedback = "";

        while (!feedback.equals("correct")) {
            guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("Is your number " + guess + "? (Respond with 'high', 'low', or 'correct')");
            feedback = sc.nextLine();

            if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            }
        }
        System.out.println("Hooray! I guessed it right.");
    }

    private static int generateGuess(int lowerBound, int upperBound, Random random) {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}
