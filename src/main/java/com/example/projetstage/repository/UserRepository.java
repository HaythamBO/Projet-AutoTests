package com.example.projetstage.repository;

<<<<<<< HEAD
import com.example.projetstage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetstage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

>>>>>>> origin/master
}
