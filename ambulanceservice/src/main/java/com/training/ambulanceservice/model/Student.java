package com.training.ambulanceservice.model;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Repository
//@RestController

public class Student {

    private String name;
    public Student(String name){
        this.name = name;
    }
}
