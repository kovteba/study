package kovteba.yml;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/yml")
@RequiredArgsConstructor
public class YmlController {

    private final YamlProperties yamlProperties;

    @GetMapping
    public YamlProperties getYamlProperties() {
        log.info(yamlProperties.toString());
        return yamlProperties;
    }

}
