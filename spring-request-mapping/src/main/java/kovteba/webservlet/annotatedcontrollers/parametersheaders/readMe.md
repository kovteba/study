# String request parameters and headers

If we have two endpoints with the same value in headers and parameters, in that case will be run parameters method. 
Parameters have higher priority than headers.

```java
@RestController
@RequestMapping(value = "/param")
public class ParametersHeaders {

    @GetMapping(value = "/head", headers = "myHeader=myValue")
    public String headers() {

        return "myValueHeader";
    }

    @GetMapping(value = "/head", params = "myHeader=myValue")
    public String params() {

        return "myValueParam";
    }
}
```

