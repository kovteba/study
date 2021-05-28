
If the filename for the banner is 'banner.txt', spring will automatically use that file. If need change filename for 
banner should add to  properties file
```properties
spring.banner.location=custom-banner.txt
```

Next options doesn't work in IntelliJ IDEA:

- ${application.title}
- ${application.version}
- ${application.formatted-version}

For check these values should run jar file:

```shell
mnv clean install
java -jar target/spring-banner-0.0.1-SNAPSHOT.jar
```
