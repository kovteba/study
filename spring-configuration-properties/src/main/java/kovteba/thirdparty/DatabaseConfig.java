package kovteba.thirdparty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class DatabaseConfig {

    @Bean
    @ConfigurationProperties("environments.database")
    public DataBaseConnect dataBaseConfig() {
        return new DataBaseConnect();
    }

}
