package ua.testing.railwaycashdesk.security.service;

public interface AuthorityService {
    String generateToken(String email, String password);
}
