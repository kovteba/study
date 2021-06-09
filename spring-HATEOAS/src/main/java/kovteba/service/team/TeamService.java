package src.main.java.kovteba.service.team;

import src.main.java.kovteba.persistance.team.entity.TeamEntity;

import java.util.List;

public interface TeamService {

    void deleteTeamById(Long id);

    TeamEntity createTeam(TeamEntity entity);

    TeamEntity updateTeam(TeamEntity entity);

    List<TeamEntity> getAllTeams();

    TeamEntity getTeamById(Long id);

}
