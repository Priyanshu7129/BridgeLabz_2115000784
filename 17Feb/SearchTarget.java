import java.util.*;
public class SearchTarget {
    public static double linearSearchTime(int arr[], int target) {
        long startTime = System.nanoTime();
        long endTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                endTime = System.nanoTime();
                break;
            }
        }
        if(endTime == 0) endTime = System.nanoTime();
        return (double)(endTime - startTime)/1000000 ;
    }
    public static double binarySearchTime(int arr[], int target) {
        int low = 0;
        int high = arr.length;

        long startTime = System.nanoTime();
        long endTime = 0;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                endTime = System.nanoTime();
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (endTime == 0)
            endTime = System.nanoTime();
        return (double)(endTime - startTime) / 1000000;
    }
    public static int[] generateArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Comparing the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes.\n");

        System.out.println("For N=1000");
        int arr[] = generateArray(1000);
        System.out.println("Enter an integer to find:");
        int target = sc.nextInt();
        System.out.println("Linear Search: " + linearSearchTime(arr,target) + " ms");
        System.out.println("Binary Search: " + binarySearchTime(arr, target) + " ms\n");
        
        System.out.println("For N=10000");
        arr = generateArray(10000);
        System.out.println("Enter an integer to find:");
        target = sc.nextInt();
        System.out.println("Linear Search: " + linearSearchTime(arr,target) + " ms");
        System.out.println("Binary Search: " + binarySearchTime(arr, target) + " ms\n");
        
        System.out.println("For N=1000000");
        arr = generateArray(1000000);
        System.out.println("Enter an integer to find:");
        target = sc.nextInt();
        System.out.println("Linear Search: " + linearSearchTime(arr,target) + " ms");
        System.out.println("Binary Search: " + binarySearchTime(arr, target) + " ms\n");        
    }
}
