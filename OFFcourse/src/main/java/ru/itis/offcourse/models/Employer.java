package ru.itis.offcourse.models;

import ru.itis.offcourse.security.role.Role;

import javax.persistence.*;
import java.util.List;

public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String passwordHash;

    private Long phone;

    private String title;
    private City city;
    private String detailedInfo;
    private List<Photo> photos;

    private List<Ad> ads;
    private List<EduResource> eduResources;
    @Enumerated(value = EnumType.STRING)
    private Role role;
}
