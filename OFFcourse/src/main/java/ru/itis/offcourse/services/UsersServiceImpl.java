package ru.itis.offcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.offcourse.dto.UserDto;
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

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public String login(String login, String password) {
        Optional<User> candidate = usersRepository.getByLoginIgnoreCase(login);
        if (candidate.isPresent()) {
            User user = candidate.get();
            if (encoder.matches(user.getPasswordHash(), password)) {
                return jwtHelper.createToken(user.getLogin(), user.getId());
            }
        }
        throw new IllegalArgumentException("Login attempt failed");
    }

    @Override
    public String register(UserDto userDto) {

        User userToSave = User.builder()
                .login(userDto.getLogin())
                .passwordHash(encoder.encode(userDto.getPassword()))
                .lastName(userDto.getLastName())
                .firstName(userDto.getFirstName())
                .middleName(userDto.getMiddleName())
                .birthday(userDto.getBirthday())
                .phone(userDto.getPhone())
                .isUserNonLocked(true)
                .build();

        if (!usersRepository.existsByLoginIgnoreCase(userToSave.getLogin())) {
            User user = usersRepository.save(userToSave);
            return jwtHelper.createToken(user.getLogin(), user.getId());
        }
        throw new IllegalArgumentException("Register attempt failed");
    }
}
