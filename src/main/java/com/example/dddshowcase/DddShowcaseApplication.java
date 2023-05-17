package com.example.dddshowcase;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DddShowcaseApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DddShowcaseApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
