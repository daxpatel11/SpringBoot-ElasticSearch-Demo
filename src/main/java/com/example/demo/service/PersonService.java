package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personrepository;
	
	public void save(Person person) {
		personrepository.save(person);
	}
	
	public Person findById(String id) {
		return personrepository.findById(id).orElse(null);
	}
	
}
