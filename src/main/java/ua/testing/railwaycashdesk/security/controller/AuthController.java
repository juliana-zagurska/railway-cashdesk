package ua.testing.railwaycashdesk.security.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.testing.railwaycashdesk.security.service.AuthorityService;

@RestController
@AllArgsConstructor
public class AuthController {

    private final AuthorityService authorityService;

    @GetMapping("/login")
    public String generateToken(@RequestParam String email,
                                @RequestParam String password) {
        return authorityService.generateToken(email, password);
    }
}
