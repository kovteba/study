package src.main.java.kovteba.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@EqualsAndHashCode(callSuper = false)
@Data
public class UserModel extends RepresentationModel<UserModel> {

    private Long id;
    private String name;

}
