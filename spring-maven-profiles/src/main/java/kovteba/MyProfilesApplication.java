package kovteba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySources({@PropertySource("classpath:application-dev.properties"),
//                  @PropertySource("classpath:application-prod.properties"),
//                  @PropertySource("classpath:application-test.properties")}) //run latest file properties
public class MyProfilesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyProfilesApplication.class, args);
    }
}
