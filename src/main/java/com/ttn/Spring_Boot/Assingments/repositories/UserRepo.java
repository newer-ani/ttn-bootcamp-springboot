package com.ttn.Spring_Boot.Assingments.repositories;

import com.abhinav.base.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
