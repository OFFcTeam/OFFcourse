package ru.itis.offcourse.services;

import ru.itis.offcourse.dto.UserDto;

public interface UserService {
    String login(String username, String password);
    void register(UserDto user);
}
