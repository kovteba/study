package kovteba;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class NotDevBean {

    public String message() {
        return "Bean ready! Bean not exists only in DEV environment";
    }
}
