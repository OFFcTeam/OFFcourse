package ru.itis.offcourse.models;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EduResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "eduResource")
    private EducationalProgram educationalProgram;

    private List<String> hashTags;
    private List<String> links;
    private String description;
    private Photo photo;
    private City city;
    private Integer maxPeople;
    private String address;
    private Double price;
    private Byte minAge;
    private LocalDateTime startOfCourseEntry;
    private LocalDateTime endOfCourseEntry;
    private LocalDateTime startOfEduProgram;

    @ManyToMany(mappedBy = "eduResources")
    private List<User> users;

}
