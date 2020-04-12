package ru.itis.offcourse.services;

public interface EmailService {
    void sendMail(String subject, String text, String email);
}
