package kovteba.customserializer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Writer {

    @JsonProperty("writerName")
    private String name;

    public Writer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
