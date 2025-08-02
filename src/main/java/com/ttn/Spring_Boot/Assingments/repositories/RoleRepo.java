package com.ttn.Spring_Boot.Assingments.repositories;

import com.abhinav.base.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role, Long> {
}
