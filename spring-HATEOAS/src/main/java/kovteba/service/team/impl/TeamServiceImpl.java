package src.main.java.kovteba.service.team.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import src.main.java.kovteba.persistance.team.entity.TeamEntity;
import src.main.java.kovteba.persistance.team.repository.TeamRepository;
import src.main.java.kovteba.service.team.TeamService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    public void deleteTeamById(Long id) {
        teamRepository.deleteById(id);
    }

    @Override
    public TeamEntity createTeam(TeamEntity entity) {
        return teamRepository.save(entity);
    }

    @Override
    public TeamEntity updateTeam(TeamEntity entity) {
        return teamRepository.save(entity);
    }

    @Override
    public List<TeamEntity> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public TeamEntity getTeamById(Long id) {
        return teamRepository.getById(id);
    }
}
