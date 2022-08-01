package com.example.demo.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2")
public class PersonaRepoImp2 implements IPersona {
	
	private static Logger log  = LoggerFactory.getLogger(PersonaRepoImp2.class);
	
	@Override
	public void registrar(String nombre) {
		log.info("Se registró a persona2- " + nombre);
		
	}

}
