package ua.testing.railwaycashdesk.security.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.testing.railwaycashdesk.security.domain.User;
import ua.testing.railwaycashdesk.security.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User findByEmail(String email) {
        return userRepository.getUser(email);
    }
}
