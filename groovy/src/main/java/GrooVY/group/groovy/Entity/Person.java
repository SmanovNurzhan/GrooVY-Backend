package GrooVY.group.groovy.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private String surname;
    @Column(nullable = false,length = 20)
    private String login;
    @Column(name = "first_password")
    private String firstPasswd;
    @NonNull
    private String password;
}
