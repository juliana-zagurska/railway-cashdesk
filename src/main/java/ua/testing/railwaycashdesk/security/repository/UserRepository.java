package ua.testing.railwaycashdesk.security.repository;

import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import ua.testing.railwaycashdesk.security.domain.Roles;
import ua.testing.railwaycashdesk.security.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Service
@AllArgsConstructor
public class UserRepository {

    private static final String FIND_USER = "SELECT us.id, us.name, us.email, us.password, r.id," +
            " r.name FROM users us JOIN users_roles ur on" +
            " us.id = ur.user_id JOIN roles r on ur.roles_id = r.id" +
            " WHERE email = :email";

    private final JdbcTemplate jdbcTemplate;

    public User getUser(String email) {
        Map<User, Set<Roles>> map = new HashMap<>();
        jdbcTemplate.query(FIND_USER, new Object[]{email}, (ResultSetExtractor<Map>) rs -> {
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setActive(rs.getBoolean("is_active"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                map.putIfAbsent(user, new HashSet<>());
                map.get(user).add(new Roles(rs.getLong("id"), rs.getString("name")));
            }
            return map;
        });
        return extractUserFromMap(map);
    }

    private User extractUserFromMap(Map<User, Set<Roles>> userSetMap) {
        User user = new User();
        for (Map.Entry<User, Set<Roles>> entry : userSetMap.entrySet()) {
            user = entry.getKey();
            user.setRolesList(new ArrayList<>(entry.getValue()));
        }
        return user;
    }
}
