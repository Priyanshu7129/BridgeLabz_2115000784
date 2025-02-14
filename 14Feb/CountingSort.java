import java.util.Arrays;
public class CountingSort {
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 14, 13, 16};
        countingSort(studentAges, 18);
        System.out.println(Arrays.toString(studentAges));
    }
    static void countingSort(int[] arr, int max) {
        int n = arr.length;
        int[] count = new int[max + 1];
        int[] output = new int[n];
        for (int num : arr) count[num]++;
        for (int i = 1; i <= max; i++) count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) output[--count[arr[i]]] = arr[i];
        System.arraycopy(output, 0, arr, 0, n);
    }
}
