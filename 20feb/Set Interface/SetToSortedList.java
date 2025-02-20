import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Set.of(5, 3, 9, 1));
        List<Integer> sortedList = convertToSortedList(hashSet);
        System.out.println("Sorted List: " + sortedList);
    }
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }
}
