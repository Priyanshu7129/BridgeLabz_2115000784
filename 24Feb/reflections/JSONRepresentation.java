import java.lang.reflect.*;

class Product {
    private String name = "Laptop";
    private int price = 1000;
}

public class JSONRepresentation {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":\"").append(field.get(obj)).append("\",");
        }
        json.setLength(json.length() - 1);
        return json.append("}").toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(toJson(new Product()));
    }
}
