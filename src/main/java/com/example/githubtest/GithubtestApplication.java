package com.example.githubtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GithubtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubtestApplication.class, args);
    }


    private String test;
}
