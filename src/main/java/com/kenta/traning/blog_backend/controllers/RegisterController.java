package com.kenta.traning.blog_backend.controllers;

import com.kenta.traning.blog_backend.models.User;
import org.springframework.stereotype.Service;

@Service
public class RegisterController {

    public User register(User user){
        return user;
    }
}
