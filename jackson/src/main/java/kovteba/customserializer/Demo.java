package kovteba.customserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Demo {

    public static void main(String[] args) throws JsonProcessingException {


        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(new WriterCustomSerializer());
        mapper.registerModule(module);

        Writer writer = new Writer("Mohit");
        String jsonWriter = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(writer);

        System.out.println(jsonWriter);
    }

}
