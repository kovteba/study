package kovteba.persistance.repository;

import kovteba.persistance.entity.Status;
import kovteba.persistance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Integer countAllByStatus(Status status);

}
