package com.gchaldu.spring_security_app.user.controller;

import com.gchaldu.spring_security_app.user.model.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<UserDto> getAll(){
        return List.of(
          new UserDto(1L, "Pepe"),
          new UserDto(2L, "Mauro")
        );
    }
}
