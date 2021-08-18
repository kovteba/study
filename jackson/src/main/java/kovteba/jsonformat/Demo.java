package kovteba.jsonformat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

public class Demo {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {

        Order order = new Order();
        order.setOrderDate(new Date());
        order.setDate(new Date());
        String jsonData = objectMapper.writeValueAsString(order);
        System.out.println(jsonData);

    }

}
