package com.example.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.Person;

@Repository
public interface PersonRepository  extends ElasticsearchRepository<Person, String>{
	
}
