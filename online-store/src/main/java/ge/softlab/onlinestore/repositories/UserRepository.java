package ge.softlab.onlinestore.repositories;
import ge.softlab.onlinestore.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findAllByUsername(String username);
}

