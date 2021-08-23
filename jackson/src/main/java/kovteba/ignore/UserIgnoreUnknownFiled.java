package kovteba.ignore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserIgnoreUnknownFiled {

    @JsonProperty("NAME")
    private String name;

    private String surname;

    public UserIgnoreUnknownFiled() {
    }

    public UserIgnoreUnknownFiled(String name) {
        this.name = name;
    }

    public UserIgnoreUnknownFiled(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
