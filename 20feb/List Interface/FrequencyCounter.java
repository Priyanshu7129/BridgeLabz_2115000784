import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = findFrequency(list);
        System.out.println(frequencyMap);
    }
    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }
}
