package com.pam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.pam.entity.Person;

@Component
public interface PersonRepository extends CrudRepository<Person, Integer> {

	

}
