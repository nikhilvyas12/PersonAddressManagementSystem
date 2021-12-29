package com.pam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pam.entity.Person;
import com.pam.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;

	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<Person>();
		personRepository.findAll().forEach(person1 -> persons.add(person1));
		return persons;
	}

	public Person getpersonAddressById(int personid) {
		// TODO Auto-generated method stub
		return personRepository.findById(personid).get();
	}

	public void delete(int bookid) {
		// TODO Auto-generated method stub
		personRepository.deleteById(bookid);
	}

	public void saveOrUpdate(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
	}



}
