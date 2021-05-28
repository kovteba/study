package kovteba.applicationarguments;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class MyApplicationArguments {

    private final ApplicationArguments args;

    @GetMapping("get")
    public ApplicationArguments get() {
        return args;
    }

}
