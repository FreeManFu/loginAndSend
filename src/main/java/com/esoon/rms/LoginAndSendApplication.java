package com.esoon.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LoginAndSendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginAndSendApplication.class, args);
    }

}
