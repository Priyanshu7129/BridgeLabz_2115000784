import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJSONFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("data.json"));
        System.out.println("Name: " + jsonNode.get("name").asText());
        System.out.println("Email: " + jsonNode.get("email").asText());
    }
}
