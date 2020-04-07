package ru.itis.offcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.offcourse.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> getByLogin(String login);
    boolean existsByLogin(String login);
}
