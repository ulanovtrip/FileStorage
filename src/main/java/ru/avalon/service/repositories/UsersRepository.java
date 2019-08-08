package ru.avalon.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.avalon.service.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {

    List<User> findAllByFirstName(String firstName);

    Optional<User> findOneByLogin(String login);
}
