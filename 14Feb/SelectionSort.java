import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] examScores = {75, 89, 62, 95, 70};
        selectionSort(examScores);
        System.out.println(Arrays.toString(examScores));
    }
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
