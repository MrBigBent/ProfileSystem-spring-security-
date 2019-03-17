package com.emre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emre.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
