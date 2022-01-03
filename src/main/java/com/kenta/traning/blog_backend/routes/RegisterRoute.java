package com.kenta.traning.blog_backend.routes;


import com.kenta.traning.blog_backend.controllers.RegisterController;
import com.kenta.traning.blog_backend.exceptionHandler.BaseException;
import com.kenta.traning.blog_backend.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterRoute {

    private final RegisterController registerController;

    public RegisterRoute(RegisterController registerController) {
        this.registerController = registerController;
    }

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User userRequest) throws BaseException {
            User user = registerController.register(userRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
