import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import java.io.File;

public class ValidateJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode schemaNode = objectMapper.readTree(new File("schema.json"));
        JsonNode jsonData = objectMapper.readTree(new File("data.json"));
        JsonSchema schema = JsonSchemaFactory.byDefault().getJsonSchema(schemaNode);
        System.out.println(schema.validate(jsonData).isSuccess() ? "Valid JSON" : "Invalid JSON");
    }
}
