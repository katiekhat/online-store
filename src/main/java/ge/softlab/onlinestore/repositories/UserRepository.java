package ge.softlab.onlinestore.repositories;
import ge.softlab.onlinestore.entities.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDomain,Integer> {
    Optional<UserDomain> findAllByUsername(String username);
}

