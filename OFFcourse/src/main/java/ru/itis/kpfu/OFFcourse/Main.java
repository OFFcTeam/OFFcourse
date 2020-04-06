package ru.itis.kpfu.OFFcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class Main extends WebMvcAutoConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}