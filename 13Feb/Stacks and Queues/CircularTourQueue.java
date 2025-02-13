import java.util.LinkedList;
import java.util.Queue;

class CircularTourQueue {
    static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();
        int totalSurplus = 0, currSurplus = 0, start = 0;

        for (int i = 0; i < n; i++) {
            int netFuel = petrol[i] - distance[i];
            queue.add(i);
            totalSurplus += netFuel;
            currSurplus += netFuel;

            while (currSurplus < 0 && !queue.isEmpty()) {
                start = queue.poll() + 1;
                currSurplus -= petrol[start - 1] - distance[start - 1];
            }
        }
        return totalSurplus >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        System.out.println(findStartingPoint(petrol, distance));
    }
}
