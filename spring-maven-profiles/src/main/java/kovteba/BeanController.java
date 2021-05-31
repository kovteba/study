package kovteba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class BeanController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/dev")
    public String devBean() {
        DevBean devBean = null;
        try {
            devBean = context.getBean("devBean", DevBean.class);
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
        return (devBean == null) ? "DevBean available only on dev env." : devBean.message();
    }

    @GetMapping("/notdev")
    public String notDevBean() {
        NotDevBean notDevBean = null;
        try {
            notDevBean = context.getBean("notDevBean", NotDevBean.class);
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
        return (notDevBean == null) ? "NotDevBean not available only on DEV env." : notDevBean.message();
    }
}
