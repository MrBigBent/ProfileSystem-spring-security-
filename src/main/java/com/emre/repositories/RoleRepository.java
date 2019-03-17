package com.emre.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.emre.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String>{

}
