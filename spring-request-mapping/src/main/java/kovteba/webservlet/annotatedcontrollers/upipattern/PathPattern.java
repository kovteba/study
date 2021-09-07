package kovteba.webservlet.annotatedcontrollers.upipattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/res")
public class PathPattern {

    @GetMapping(value = "/*.png")
    public String method1() {
        return "*.png";
    }

    @GetMapping(value = "/**")
    public String method2() {
        return "**";
    }

    @GetMapping(value = "/image?.png")
    public String method3() {
        return "?";
    }

    @GetMapping(value = "/{project:[a-z]+}")
    public String method4(@PathVariable String project) {

        return project;
    }

}
