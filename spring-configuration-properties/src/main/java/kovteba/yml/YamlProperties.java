package kovteba.yml;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
@Component
@Validated
@ConfigurationProperties("environments.dev")
public class YamlProperties {

    private Admin admin = new Admin();

    private String url;
    private String name;
    private List<String> status;
    private List<Integer> randomValues;
    private UUID secretCode;
    private HashMap<String, Integer> randomMap;

    @Data
    public static class Admin {

        private String username;
        private String password;
    }
}
