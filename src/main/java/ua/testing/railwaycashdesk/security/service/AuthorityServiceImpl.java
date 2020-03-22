package ua.testing.railwaycashdesk.security.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.testing.railwaycashdesk.security.domain.User;
import ua.testing.railwaycashdesk.security.exception.UserNotFoundException;
import ua.testing.railwaycashdesk.security.jwt.JwtService;

@Service
@AllArgsConstructor
public class AuthorityServiceImpl implements AuthorityService {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final JwtService jwtService;


    @Override
    public String generateToken(String email, String password) {
        User user = userService.findByEmail(email);
        if (user == null || bCryptPasswordEncoder.matches(password, user.getPassword())) {
            throw new UserNotFoundException("User not found!");
        }
        return jwtService.generateToken(user.getName(), user.getRolesList());
    }
}
