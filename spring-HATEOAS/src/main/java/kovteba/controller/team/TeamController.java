package src.main.java.kovteba.controller.team;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.main.java.kovteba.mapper.team.TeamMapper;
import src.main.java.kovteba.model.team.TeamModel;
import src.main.java.kovteba.persistance.team.repository.TeamRepository;
import src.main.java.kovteba.service.team.TeamService;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;
    private final TeamMapper teamMapper;

    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<TeamModel>> getTeamById(@PathVariable Long id) {

        var teamById = teamService.getTeamById(id);

        return ResponseEntity.ok(EntityModel.of(teamMapper.entityToModel(teamById)));
    }

    @PutMapping("/{id}")
    public EntityModel<TeamModel> updateTeam(@PathVariable Long id, @RequestBody TeamModel teamModel) {

        var updatedTeam = teamService.updateTeam(teamMapper.modelToEntity(teamModel));

        return EntityModel.of(teamMapper.entityToModel(updatedTeam));
    }

    @GetMapping("/all")
    public List<TeamModel> getAllTeams() {

        return teamService.getAllTeams().stream()
                                        .map(teamMapper::entityToModel)
                                        .collect(Collectors.toList());
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Void> deleteTeamById(@PathVariable Long id) {
        teamService.deleteTeamById(id);
        return ResponseEntity.ok(null);
    }
}
