package kovteba.webservlet.annotatedcontrollers.parametersheaders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/param")
public class ParametersHeaders {

    private String value;

    @GetMapping(value = "/head", headers = "myHeader=myValue")
    public String headers() {

        return "myValueHeader";
    }

    @GetMapping(value = "/head", params = "myHeader=myValue")
    public String params() {

        return "myValueParam";
    }
}
