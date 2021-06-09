package src.main.java.kovteba.processor.team;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import src.main.java.kovteba.controller.team.TeamController;
import src.main.java.kovteba.model.team.TeamModel;


import static org.springframework.hateoas.server.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class TeamProcessor implements RepresentationModelProcessor<TeamModel> {

    @Override
    public TeamModel process(TeamModel model) {

        model.add(linkTo(methodOn(TeamController.class).getTeamById(model.getId())).withRel("GET"));
        model.add(linkTo(methodOn(TeamController.class).updateTeam(model.getId(), model)).withRel("PUT"));
        model.add(linkTo(methodOn(TeamController.class).deleteTeamById(model.getId())).withRel("DELETE"));

        log.info("Team model: {}.", model);

        return model;
    }
}
