package kovteba.jsonproperty;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {

        Player player = new Player("Dima", Gender.MALE);
        String objectToJson = objectMapper.writeValueAsString(player);
        System.out.println(objectToJson);

        String jsonData1 = "{\"Name\" : \"Dima\"}";
        String jsonData2 = "{\"nAme\" : \"Dima\", \"gender\" : \"male\"}";

        Player player1 = objectMapper.readValue(jsonData1, Player.class);
        Player player2 = objectMapper.readValue(jsonData2, Player.class);
        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }
}
