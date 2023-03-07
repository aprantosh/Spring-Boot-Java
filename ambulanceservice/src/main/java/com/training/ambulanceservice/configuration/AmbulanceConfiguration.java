package com.training.ambulanceservice.configuration;

import com.training.ambulanceservice.model.Ambulance;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AmbulanceConfiguration {
    private Ambulance ambulance1;
    private Ambulance ambulance2;
    @Bean
//    @Qualifier
//    @Lazy

    public Ambulance createAmbulance(){
        System.out.println("Ambulance object is created");
        return new Ambulance();
    }

}
