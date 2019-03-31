package com.emre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emre.entities.Task;
import com.emre.entities.User;
import com.emre.repositories.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository; 
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	public List<Task> findUserTask(User user) {
		return taskRepository.findByUser(user);
	}
}
