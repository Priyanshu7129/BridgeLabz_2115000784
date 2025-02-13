import java.util.*;
class ZeroSumSubarrays {
    static List<int[]> findSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        List<int[]> subarrays = findSubarrays(arr);
        for (int[] subarray : subarrays) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}
