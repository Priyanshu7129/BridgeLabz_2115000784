import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {103, 101, 108, 102, 107};
        insertionSort(employeeIDs);
        System.out.println(Arrays.toString(employeeIDs));
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
