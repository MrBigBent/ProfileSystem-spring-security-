package com.emre.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emre.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);

	List<User> findByNameLike(String name);

}
