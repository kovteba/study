package kovteba.customserializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class WriterCustomSerializer extends StdSerializer<Writer> {

    private static final long serialVersionUID = 1L;
    public WriterCustomSerializer() {
        this(Writer.class);
    }
    protected WriterCustomSerializer(Class<Writer> t) {
        super(t);
    }

    @Override
    public void serialize(Writer writer, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("writerName", "Mr. "+ writer.getName());
        jsonGenerator.writeEndObject();

    }


}
