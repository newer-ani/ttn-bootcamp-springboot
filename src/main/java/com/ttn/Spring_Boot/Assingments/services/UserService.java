package com.ttn.Spring_Boot.Assingments.services;

import com.ttn.Spring_Boot.Assingments.dtos.UserDto;
import org.springframework.http.converter.json.MappingJacksonValue;

import java.util.List;

public interface UserService {


    void createUser(UserDto user);

    List<UserDto> findAllUsers();

    void deleteUser(int id);

    MappingJacksonValue getFilteredUsers();
}
