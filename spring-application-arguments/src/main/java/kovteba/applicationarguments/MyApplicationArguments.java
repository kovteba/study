package kovteba.applicationarguments;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.Objects.nonNull;

@Slf4j
@RestController
@RequestMapping("/")
@AllArgsConstructor
public class MyApplicationArguments {

    private final ApplicationArguments args;

    @GetMapping("get")
    public ApplicationArguments get() {

        var debug = args.containsOption("debug");
        List<String> nonOptionArgs = args.getNonOptionArgs();
        String[] sourceArgs = args.getSourceArgs();
        Set<String> optionNames = args.getOptionNames();
        List<String> debug1 = args.getOptionValues("debug");

        log.info("args.containsOption(\"debug\") : {}", debug);

        if (nonNull(nonOptionArgs)) {
            log.info("args.getNonOptionArgs(): " + nonOptionArgs);
        }

        if (sourceArgs.length != 0) {
            log.info("args.getSourceArgs(): " + Arrays.toString(sourceArgs));
        }

        if (nonNull(optionNames)) {
            log.info("args.getOptionNames(): " + optionNames);
        }

        if (nonNull(debug1)) {
            log.info("args.getOptionValues(): " + debug1);
        }

        return args;
    }

}
