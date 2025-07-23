package com.ttn.Spring_Boot.Assingments.services.impl;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.ttn.Spring_Boot.Assingments.dtos.UserDto;
import com.ttn.Spring_Boot.Assingments.services.UserService;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<UserDto> users = new ArrayList<>();

    @Override
    public void createUser(UserDto user) {
        users.add(user);
    }

    @Override
    public List<UserDto> findAllUsers() {
        return users;
    }

    @Override
    public void deleteUser(int id) {
        Iterator<UserDto> it = users.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
            }
        }
    }

    public MappingJacksonValue getFilteredUsers() {
        MappingJacksonValue mapping = new MappingJacksonValue(users);

        // Dynamic filtering: only show name and email
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("name", "email");

        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("UserFilter", filter);

        mapping.setFilters(filters);
        return mapping;
    }
}
