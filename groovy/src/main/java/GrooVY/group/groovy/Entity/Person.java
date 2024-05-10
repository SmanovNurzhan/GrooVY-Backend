package GrooVY.group.groovy.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String surname;
    private String login;
    @Column(name = "first_password")
    private String firstPasswd;
    private String password;
}
