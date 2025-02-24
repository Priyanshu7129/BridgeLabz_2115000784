import java.lang.reflect.*;
import java.util.*;

class User {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public String toString() { return "User{name='" + name + "', age=" + age + "}"; }
}
public class CreateCustomObject {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String setterName = "set" + Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1);
            Method method = clazz.getMethod(setterName, entry.getValue().getClass());
            method.invoke(obj, entry.getValue());
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 28);
        
        User user = toObject(User.class, data);
        System.out.println(user);
    }
}
