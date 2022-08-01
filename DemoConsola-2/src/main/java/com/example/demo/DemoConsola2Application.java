package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IPersonaService;

@SpringBootApplication
public class DemoConsola2Application implements CommandLineRunner{

	@Autowired
	private IPersonaService service;
	
			
	public static void main(String[] args) {
		SpringApplication.run(DemoConsola2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.registrar("Abraham");
		
	}

}
