package kovteba.applicationarguments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:application-arguments.properties")
//@Profile("arguments")
public class MyApplicationArgumentsApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApplicationArgumentsApp.class, args);
    }

}
