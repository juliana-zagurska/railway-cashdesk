package ua.testing.railwaycashdesk.security.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"rolesList"})
public class User {
    private  long id;
    private String name;
    private String email;
    private String password;
    List<Roles> rolesList;
    private boolean isActive;
}
