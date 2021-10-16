package com.unab.apijava;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApijavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApijavaApplication.class, args);
		System.out.println("Api corriendo...");
	}
	
	@Bean
	public ModelMapper modelMapper(){
		ModelMapper mapper =new ModelMapper();

		return mapper;
	}

}
