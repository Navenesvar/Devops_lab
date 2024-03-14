package com.naven.simple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naven.simple.domain.login;
import com.naven.simple.repository.Logrepo;

@Service
public class LogService {
    @Autowired
    private Logrepo rep;
    public login log(String username,String password)
    {
        login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }

}
