package src.main.java.kovteba.persistance.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import src.main.java.kovteba.persistance.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
