package src.main.java.kovteba.model.team;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;
import src.main.java.kovteba.model.user.UserModel;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class TeamModel extends RepresentationModel<TeamModel> {

    private Long id;
    private String name;
    private List<UserModel> members;

}
