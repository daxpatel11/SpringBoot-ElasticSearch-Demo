package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.document.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

	@Autowired
	private PersonService personservice;
	
	
	@PostMapping
	public void save(@RequestBody Person person) {
		personservice.save(person);
	}
	
	@GetMapping("/{id}")
	public Person findById(@PathVariable String id) {
		return personservice.findById(id);
	}
}
