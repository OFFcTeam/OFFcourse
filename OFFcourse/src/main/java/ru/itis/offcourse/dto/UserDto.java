package ru.itis.offcourse.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserDto {
    private String login;
    private String password;
    private String lastName;
    private String firstName;
    private String middleName;
    private Long phone;
    private Date birthday;

}
