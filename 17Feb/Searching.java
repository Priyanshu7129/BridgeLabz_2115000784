import java.util.*;
public class Searching {
    public static int[] generateArray(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static HashSet<Integer> generateHashSet(int size) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }

        return set;
    }
    public static TreeSet<Integer> generateTreeSet(int size) {
        TreeSet<Integer> tSet = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            tSet.add(i);
        }

        return tSet;
    }
    public static void searchInArray(int arr[], int target) {
        long startTime = System.nanoTime();
        long endTime = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                endTime = System.nanoTime();
                break;
            }
        }
        if (endTime == 0)
            endTime = System.nanoTime();

        System.out.println("Array: " + ((double) (endTime - startTime) / 1000000) + " ms");
    }
    public static void searchInHashSet(HashSet<Integer> set, int target) {
        long startTime = System.nanoTime();
        set.contains(target);
        long endTime = System.nanoTime();

        System.out.println("HashSet: " + ((double) (endTime - startTime) / 1000000) + " ms");
    }
    public static void searchInTreeSet(TreeSet<Integer> tSet, int target) {
        long startTime = System.nanoTime();
        tSet.contains(target);
        long endTime = System.nanoTime();

        System.out.println("HashSet: " + ((double) (endTime - startTime) / 1000000) + " ms");
    }
    public static void main(String[] args) {
        System.out.println("Comparing Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("For N = 1000");
        System.out.println("Enter an integer to search:");
        int target = sc.nextInt();
        searchInArray(generateArray(1000), target);
        searchInHashSet(generateHashSet(1000), target);
        searchInTreeSet(generateTreeSet(1000), target);

        System.out.println("For N = 100000");
        System.out.println("Enter an integer to search:");
        target = sc.nextInt();
        searchInArray(generateArray(100000), target);
        searchInHashSet(generateHashSet(100000), target);
        searchInTreeSet(generateTreeSet(100000), target);

        System.out.println("For N = 1000000");
        System.out.println("Enter an integer to search:");
        target = sc.nextInt();
        searchInArray(generateArray(1000000), target);
        searchInHashSet(generateHashSet(1000000), target);
        searchInTreeSet(generateTreeSet(1000000), target);
    }

}
