package ua.testing.railwaycashdesk.security.exception;

public class UserNotFoundException extends RuntimeException {


    public UserNotFoundException(String message) {
        super(message);
    }
}
