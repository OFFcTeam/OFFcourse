package ru.itis.offcourse.models;

import lombok.*;
import ru.itis.offcourse.security.role.Role;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
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

    @Enumerated(value = EnumType.STRING)
    private Role role;

    private Long phone;
    private Boolean isUserNonLocked;
    private Boolean isEmailConfirmed;
    private String confirmString;

    @OneToMany(mappedBy = "author")
    private List<Comment> comments;

    @ManyToMany(mappedBy = "users")
    private List<EduResource> eduResources;

    @OneToMany(mappedBy = "users")
    private Subscription subscription;
}
