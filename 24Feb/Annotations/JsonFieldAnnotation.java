import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}
class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, Object> jsonElements = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                jsonElements.put(jsonField.name(), field.get(obj));
            }
        }
        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : jsonElements.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }
        jsonString.delete(jsonString.length() - 2, jsonString.length());
        jsonString.append("}");

        return jsonString.toString();
    }
}
public class JsonFieldAnnotation {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("JohnDoe", 30);
        String json = JsonSerializer.toJson(user);
        System.out.println(json); 
    }
}
