package ru.itis.offcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.offcourse.dto.UserDto;
import ru.itis.offcourse.models.User;
import ru.itis.offcourse.repositories.UsersRepository;
import ru.itis.offcourse.security.helper.JwtHelper;
import ru.itis.offcourse.security.role.Role;

import java.util.Optional;
import java.util.UUID;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private JwtHelper jwtHelper;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private EmailService emailService;

    @Override
    public String login(String login, String password) {
        Optional<User> candidate = usersRepository.getByLoginIgnoreCase(login);
        if (candidate.isPresent()) {
            User user = candidate.get();
            if (encoder.matches(password, user.getPasswordHash())) {
                return jwtHelper.createToken(user);
            }
        }
        throw new IllegalArgumentException("Login attempt failed");
    }

    @Override
    public void register(UserDto userDto) {
        String confirmString = UUID.randomUUID().toString();

        User userToSave = User.builder()
                .login(userDto.getLogin())
                .passwordHash(encoder.encode(userDto.getPassword()))
                .lastName(userDto.getLastName())
                .firstName(userDto.getFirstName())
                .middleName(userDto.getMiddleName())
                .birthday(userDto.getBirthday())
                .phone(userDto.getPhone())
                .role(Role.USER)
                .isUserNonLocked(true)
                .isEmailConfirmed(false)
                .confirmString(confirmString)
                .build();

        if (!usersRepository.existsByLoginIgnoreCase(userToSave.getLogin())) {
            User user = usersRepository.saveAndFlush(userToSave);
            String text = "<a href='http://localhost:8080/confirm/" + user.getConfirmString() + "'>" +"Пройдите по ссылке" + "</a>";
            emailService.sendMail("Подтвреждение регистрации", text, user.getLogin());
            return;
        }
        throw new IllegalArgumentException("Register attempt failed");
    }
}
