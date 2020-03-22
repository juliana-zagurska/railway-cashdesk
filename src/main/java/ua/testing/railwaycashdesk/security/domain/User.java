package ua.testing.railwaycashdesk.security.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  long id;
    private String name;
    private String email;
    private String password;
    List<Roles> rolesList;
    private boolean isActive;
}
