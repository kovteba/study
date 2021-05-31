package kovteba;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevBean {

    public String message() {
        return "Bean ready! Bean exists only in DEV environment";
    }
}
