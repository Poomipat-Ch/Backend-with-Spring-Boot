package com.kenta.traning.blog_backend.controllers;

import com.kenta.traning.blog_backend.exceptionHandler.BaseException;
import com.kenta.traning.blog_backend.exceptionHandler.RegisterException;
import com.kenta.traning.blog_backend.models.User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Service
public class RegisterController {

    public User register(User user) throws BaseException {
        if (user == null){
            throw RegisterException.requestNull();
        }

        if (Objects.isNull(user.getUsername())){
            throw RegisterException.usernameNull();
        }

        if (Objects.isNull(user.getPassword())){
            throw RegisterException.passwordNull();
        }
        return user;
    }
}
