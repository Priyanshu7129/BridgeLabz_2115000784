import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class FilterJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(new File("data.json"));
        Iterator<JsonNode> elements = root.elements();

        while (elements.hasNext()) {
            JsonNode person = elements.next();
            if (person.get("age").asInt() > 25) {
                System.out.println(person.toString());
            }
        }
    }
}
