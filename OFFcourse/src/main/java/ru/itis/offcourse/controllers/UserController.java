package ru.itis.offcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.offcourse.dto.LoginDto;
import ru.itis.offcourse.dto.TokenDto;
import ru.itis.offcourse.dto.UserDto;
import ru.itis.offcourse.models.User;
import ru.itis.offcourse.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(TokenDto.from(userService.login(loginDto.getLogin(), loginDto.getPassword())));
    }

    @PostMapping("/registration")
    public ResponseEntity<TokenDto> register(@RequestBody UserDto userDto) {
        try {
            return ResponseEntity.ok(TokenDto.from(userService.register(userDto)));
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

}
