package ua.testing.railwaycashdesk.security.service;

import ua.testing.railwaycashdesk.security.domain.User;

public interface UserService {
    User findByEmail(String email);
}
