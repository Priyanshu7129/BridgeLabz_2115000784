import java.util.Random;
public class RandomValues {
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + random.nextInt(9000); 
        }
        return randomNumbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        double[] results = findAverageMinMax(randomNumbers);
        double average = results[0];
        int min = (int) results[1];
        int max = (int) results[2];
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}