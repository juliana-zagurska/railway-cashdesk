package ua.testing.railwaycashdesk.security.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public class UserConverter {

    public static List<SimpleGrantedAuthority> getUserRolesFromStringList(List<String> list) {
        return list.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
