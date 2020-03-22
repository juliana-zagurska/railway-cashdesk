package ua.testing.railwaycashdesk.security.repository;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ua.testing.railwaycashdesk.security.domain.User;

import java.util.Collections;

@Service
@AllArgsConstructor
public class UserRepository {

    private static final String FIND_USER = "SELECT FROM user WHERE email = :email";

    private final JdbcTemplate jdbcTemplate;

    public User getUser(String email) {

        return jdbcTemplate.queryForObject(FIND_USER, new Object[]{email}, (rs, rownum) -> {
            User user = new User();
            while (rs.next()) {
                user.setId(rs.getLong("id"));
                user.setActive(rs.getBoolean("is_active"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
            }
            return user;
        });
    }

}
