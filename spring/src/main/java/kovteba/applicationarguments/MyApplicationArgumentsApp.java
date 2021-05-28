package kovteba.applicationarguments;

import kovteba.banner.MyBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = "kovteba.applicationarguments")
@PropertySource("classpath:application-arguments.properties")
@Profile("arguments")
public class MyApplicationArgumentsApp {
    public static void main(String[] args) {
        SpringApplication.run(MyBanner.class, args);
    }
}
