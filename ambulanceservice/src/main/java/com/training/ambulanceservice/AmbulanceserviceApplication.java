package com.training.ambulanceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmbulanceserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbulanceserviceApplication.class, args);
	}

	@GetMapping(value = "/")
	public String home(){
		return "Hello Spring Boot";
	}

	@GetMapping(value = "/test")
	public String prantosh(){
		return "This is test";
	}


	@GetMapping(value = "/test/1")
	public String neupane(){
		return "This is test 1";
	}
}
