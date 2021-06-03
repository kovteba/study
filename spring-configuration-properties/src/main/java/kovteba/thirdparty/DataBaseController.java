package kovteba.thirdparty;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/db")
public class DataBaseController {

    private final DataBaseConnect dataBaseConnect;

    @GetMapping
    public DataBaseConnect getDataBaseConfig() {
        return dataBaseConnect;
    }

}
