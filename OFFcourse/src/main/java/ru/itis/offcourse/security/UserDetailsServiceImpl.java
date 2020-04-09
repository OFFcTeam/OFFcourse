package ru.itis.offcourse.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itis.offcourse.models.Role;
import ru.itis.offcourse.models.User;
import ru.itis.offcourse.repositories.UsersRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service(value = "customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<User> userOptional = usersRepository.getByLoginIgnoreCase(login);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            for (Role role : user.getRoles()){
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getTitle()));
            }
            return new UserDetailsImpl(user, grantedAuthorities);
        } else throw new SecurityException("User with email <" + login + "> not found");
    }
}
