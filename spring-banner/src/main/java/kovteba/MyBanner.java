package kovteba;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBanner {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyBanner.class);
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
