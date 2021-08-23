package kovteba.jsonproperty;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {

    @JsonProperty("male")
    MALE,

    @JsonProperty("female")
    FEMALE

}
