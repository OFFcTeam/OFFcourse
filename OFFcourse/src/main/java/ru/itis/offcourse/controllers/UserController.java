package ru.itis.offcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.offcourse.dto.TokenDto;
import ru.itis.offcourse.dto.UserDto;
import ru.itis.offcourse.models.User;
import ru.itis.offcourse.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("login")
    public ResponseEntity<TokenDto> login(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(TokenDto.from(userService.login(userDto.getLogin(), userDto.getPassword())));
    }

    @CrossOrigin
    @PostMapping("register")
    public ResponseEntity<TokenDto> register(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(TokenDto.from(userService.register(User
                .builder()
                .login(userDto.getLogin())
                .passwordHash(userDto.getPassword())
                .build())));
    }

}
