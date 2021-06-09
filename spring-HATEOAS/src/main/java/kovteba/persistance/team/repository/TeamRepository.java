package src.main.java.kovteba.persistance.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import src.main.java.kovteba.persistance.team.entity.TeamEntity;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
