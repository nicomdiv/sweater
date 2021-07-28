package ru.jm2.sweater.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jm2.sweater.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}