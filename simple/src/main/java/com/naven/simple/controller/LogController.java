package com.naven.simple.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.naven.simple.domain.login;
import com.naven.simple.service.LogService;

@Controller
public class LogController {
 
    @Autowired
    private LogService service;
 
    @GetMapping("/")
    public String api()
    {
        return "login";
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") login user) {
 
        login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/display";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/display")
    public String display() {
        return "display";
    }
}
