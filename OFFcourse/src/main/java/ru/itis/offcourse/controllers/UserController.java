package ru.itis.offcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.offcourse.dto.LoginDto;
import ru.itis.offcourse.dto.TokenDto;
import ru.itis.offcourse.dto.UserDto;
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
            userService.register(userDto);
            return ResponseEntity.ok().build();
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

}
