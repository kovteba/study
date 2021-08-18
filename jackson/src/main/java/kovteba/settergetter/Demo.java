package kovteba.settergetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Demo {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonData =   "{"
                +"\"village\" : \"ABCD\","
                +"\"district\" : \"Varanasi\","
                +"\"state\" : \"Uttar Pradesh\","
                +"\"country\" : \"India\""
                +"}";

        ObjectMapper mapper = new ObjectMapper();
        Address address = mapper.readValue(jsonData, Address.class);
        Map<String, String> details = address.getAddress();
        for(String key: details.keySet()) {
            System.out.println(key+": "+ details.get(key));
        }
    }

}
