package kovteba.banner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = "kovteba.banner")
@PropertySource("classpath:application-banner.properties")
@Profile("banner")
public class MyBanner {

    public static void main(String[] args) {
        var run = SpringApplication.run(MyBanner.class, args);


//        SpringApplication application = new SpringApplication(MyBanner.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);
    }
}
