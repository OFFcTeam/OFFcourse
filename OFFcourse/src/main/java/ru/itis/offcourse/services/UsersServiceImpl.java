package ru.itis.offcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.offcourse.jwt.JwtHelper;
import ru.itis.offcourse.models.User;
import ru.itis.offcourse.repositories.UsersRepository;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private JwtHelper jwtHelper;

    @Override
    public String login(String login, String password) {
        Optional<User> candidate = usersRepository.getByLogin(login);
        if (candidate.isPresent()) {
            User user = candidate.get();
            if (password.equals(user.getPasswordHash())) {
                return jwtHelper.createToken(user.getLogin(), user.getId());
            }
        }
        throw new IllegalArgumentException("Login attempt failed");
    }

    @Override
    public String register(User userToSave) {
        if (!usersRepository.existsByLogin(userToSave.getLogin())) {
            User user = usersRepository.save(userToSave);
            return jwtHelper.createToken(user.getLogin(), user.getId());
        }
        throw new IllegalArgumentException("Register attempt failed");
    }
}
