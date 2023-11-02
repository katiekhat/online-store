package ge.softlab.onlinestore.security;

import ge.softlab.onlinestore.entities.UserDomain;
import ge.softlab.onlinestore.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import java.util.Optional;

@RequiredArgsConstructor
public class ApplicationUserManager implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDomain> users = userRepository.findAllByUsername(username);
        if (users.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        return users.get();
    }
}