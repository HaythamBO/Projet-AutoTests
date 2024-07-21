package com.example.projetstage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetstage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
