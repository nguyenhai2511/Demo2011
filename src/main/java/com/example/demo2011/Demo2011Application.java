package com.example.demo2011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2011Application {

    @GetMapping("/")
    public String index(){
        return "WELCOME TO AZURE";
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo2011Application.class, args);
    }

}
