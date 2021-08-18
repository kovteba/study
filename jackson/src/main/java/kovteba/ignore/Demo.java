package kovteba.ignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {


    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {

        // ignore filed
        UserIgnoreFiled userIgnoreFiled = new UserIgnoreFiled("IVAN");
        String jsonData = objectMapper.writeValueAsString(userIgnoreFiled);
        System.out.println(jsonData);

        // ignore unknown filed
        String jsonData1 = "{\"NAME\" : \"Dima\", \"surname\" : \"Kovteba\", \"UNKNOWN\" : \"1\"}";
        UserIgnoreUnknownFiled userIgnoreFiled1 = objectMapper.readValue(jsonData1, UserIgnoreUnknownFiled.class);
        System.out.println(userIgnoreFiled1);

        UserIgnoreNullAndEmpty userIgnoreNullAndEmpty = new UserIgnoreNullAndEmpty("Dima", "", null);
        String s = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userIgnoreNullAndEmpty);
        System.out.println(s);

    }

}
