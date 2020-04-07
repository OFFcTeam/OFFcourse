package ru.itis.offcourse.services;

import ru.itis.offcourse.models.User;

public interface UserService {
    String login(String username, String password);
    String register(User user);
}
