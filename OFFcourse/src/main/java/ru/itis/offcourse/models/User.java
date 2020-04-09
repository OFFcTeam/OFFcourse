package ru.itis.offcourse.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthday;

    @Column(length = 1000)
    private String login;
    private String passwordHash;

    @ManyToMany
    private Set<Role> roles;

    private Boolean isUserNonLocked;
    private Long phone;
}
