import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class IPLCensor {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) objectMapper.readTree(new File("ipl.json"));

        for (JsonNode match : matches) {
            ((ObjectNode) match).put("team1", censorTeam(match.get("team1").asText()));
            ((ObjectNode) match).put("team2", censorTeam(match.get("team2").asText()));
            ((ObjectNode) match).put("player_of_match", "REDACTED");
        }

        objectMapper.writeValue(new File("ipl_censored.json"), matches);
        System.out.println("Censored JSON saved.");
    }

    private static String censorTeam(String team) {
        return team.split(" ")[0] + " ***";
    }
}
