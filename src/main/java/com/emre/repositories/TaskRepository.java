package com.emre.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emre.entities.Task;
import com.emre.entities.User;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}
