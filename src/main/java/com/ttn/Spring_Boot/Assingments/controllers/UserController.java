package com.ttn.Spring_Boot.Assingments.controllers;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.ttn.Spring_Boot.Assingments.dtos.UserDto;
import com.ttn.Spring_Boot.Assingments.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
public class UserController {

    private final MessageSource messageSource;
    private final UserService userService;

     public UserController(MessageSource messageSource,UserService userService)
    {
        this.messageSource=messageSource;
        this.userService= userService;
    }

    @Operation
    @GetMapping("/i18n")
    public String greetLocaleUser(@RequestParam String username)
    {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("greet.message",new Object[]{username},locale);
    }
    @Operation(
            summary = "Create a new user",
            description = "This endpoint allows you to create a new user by passing user details in XML format."
    )
    @PostMapping(value = "/addUser",consumes = MediaType.APPLICATION_XML_VALUE)
    public HttpStatus addUser(@RequestBody UserDto u )
    {
        userService.createUser(u);
        return HttpStatus.OK;
    }

    @Operation(
            summary = "get all the users",
            description = "This endpoint allows you to get the list of users in XML format"
    )
    @GetMapping(value="/users",produces =MediaType.APPLICATION_XML_VALUE )
    public List<UserDto> getUsers()
    {
       return userService.findAllUsers();
    }

    @Operation(
            summary = "delete a user",
            description = "This endpoint is used to delete a user."
    )
    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam int id)
    {
      userService.deleteUser(id);
    }

    @GetMapping("/public")
    public MappingJacksonValue dynamicFiltering()
    {
       return  userService.getFilteredUsers();
    }
}
