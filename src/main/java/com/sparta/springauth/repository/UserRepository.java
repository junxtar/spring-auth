package com.sparta.springauth.repository;

import com.sparta.springauth.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository< User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);


}
