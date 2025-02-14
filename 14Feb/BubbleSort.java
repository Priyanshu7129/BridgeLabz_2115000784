import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {85, 78, 90, 66, 95};
        bubbleSort(marks);
        System.out.println(Arrays.toString(marks));
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
