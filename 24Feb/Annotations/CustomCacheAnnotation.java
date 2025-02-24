import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}
class ExpensiveOperations {
    private Map<String, Integer> cache = new HashMap<>();

    @CacheResult
    public int expensiveCalculation(int x, int y) {
        String key = x + "," + y;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        int result = x * y;  
        cache.put(key, result);
        return result;
    }
}
public class CustomCacheAnnotation {
    public static void main(String[] args) throws Exception {
        ExpensiveOperations operations = new ExpensiveOperations();

        int result1 = operations.expensiveCalculation(2, 3);
        System.out.println("Result 1: " + result1); 

        int result2 = operations.expensiveCalculation(2, 3);
        System.out.println("Result 2: " + result2);  
    }
}
