package ru.itis.offcourse.models;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

public class EduResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

}
