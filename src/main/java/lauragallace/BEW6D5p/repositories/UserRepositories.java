package lauragallace.BEW6D5p.repositories;

import lauragallace.BEW6D5p.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositories extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    Optional<Object> findById(UUID id);
}