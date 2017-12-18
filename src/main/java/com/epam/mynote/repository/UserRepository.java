package com.epam.mynote.repository;

import com.epam.mynote.domain.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User getOne(Long id);

    List<User> findAll();
}
