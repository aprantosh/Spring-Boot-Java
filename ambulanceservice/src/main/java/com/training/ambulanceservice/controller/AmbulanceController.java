package com.training.ambulanceservice.controller;


import com.training.ambulanceservice.model.Ambulance;
import com.training.ambulanceservice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmbulanceController {

    @Autowired
   // @Qualifier("ambulance")

    private Student student;

    @GetMapping(value = "/")
    public String ping(){
    //    Ambulance ambulance = new Ambulance();
       // System.out.println("Inside");

        return "success";
    }
}
