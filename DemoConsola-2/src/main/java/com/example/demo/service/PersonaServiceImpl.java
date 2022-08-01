package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPersona;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	@Qualifier("persona1")
	private IPersona repo;
	
	
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
		
	}

		
}
