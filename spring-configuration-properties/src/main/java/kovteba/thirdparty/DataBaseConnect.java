package kovteba.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataBaseConnect {

    private String url;
    private String dbUser;
    private String dbPassword;

}
