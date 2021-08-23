package kovteba.settergetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class Address {

    private Map<String, String> addressDetails = new HashMap<>();

    @JsonAnyGetter
    public Map<String, String> getAddress() {
        return addressDetails;
    }
    @JsonAnySetter
    public void setAddress(String name, String value) {
        this.addressDetails.put(name, value);
    }

}
