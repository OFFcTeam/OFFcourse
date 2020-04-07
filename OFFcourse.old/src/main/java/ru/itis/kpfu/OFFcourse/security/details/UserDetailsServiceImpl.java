package ru.itis.kpfu.OFFcourse.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.itits.restapi.models.Token;
import ru.itits.restapi.repositories.TokensRepository;

import java.util.Optional;

@Service(value = "customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private TokensRepository tokensRepository;

  @Override
  public UserDetails loadUserByUsername(String value) throws UsernameNotFoundException {
    Optional<Token> authenticationCandidate = tokensRepository.findFirstByValue(value);
    if (authenticationCandidate.isPresent()) {
      Token token = authenticationCandidate.get();
      return new UserDetailsImpl(token.getUser(), token);
    } return null;
  }
}
