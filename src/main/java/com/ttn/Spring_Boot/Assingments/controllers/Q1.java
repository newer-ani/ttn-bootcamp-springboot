package com.ttn.Spring_Boot.Assingments.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Q1 {

    @GetMapping("/welcome")
    @ResponseBody
    public String firstResponse()
    {
        return "Welcome to spring boot";
    }
}
