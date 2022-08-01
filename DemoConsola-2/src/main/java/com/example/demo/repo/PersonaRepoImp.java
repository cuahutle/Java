package com.example.demo.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class PersonaRepoImp implements IPersona {

	private static Logger log = LoggerFactory.getLogger(PersonaRepoImp.class);
	@Override
	public void registrar(String nombre) {
		log.info("Se registró a persona1- " +  nombre);
		
	}

}
