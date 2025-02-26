import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class FilterUserByAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(new File("users.json"));

        Iterator<JsonNode> elements = root.elements();
        while (elements.hasNext()) {
            JsonNode user = elements.next();
            if (user.get("age").asInt() > 25) {
                System.out.println(user.toString());
            }
        }
    }
}
