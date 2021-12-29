package com.pam.controller;

import com.pam.entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pam.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	

	
	@Autowired
	PersonService personservice;
	
	 @RequestMapping(value = "/getallpersondetails", method= RequestMethod.GET)
	private List<Person> getAllPerson(){
		
		return personservice.getAllPerson();
	}
	
	 @RequestMapping(value = "/{personid}", method= RequestMethod.GET)
	private String getpersonbyid(@PathVariable("personid") int personid)   
	{  
	return personservice.getpersonAddressById(personid).getPersonAdress();  
	}  

	@RequestMapping(value = "/{personid}", method= RequestMethod.DELETE)
	private  ResponseEntity<String> deleteBook(@PathVariable("personid") int personid)   
	{  
		personservice.delete(personid);
		return ResponseEntity.status(HttpStatus.OK)
		        .body("Person with ID :- " + personid+" is Deleted "); 

	} 
	
	@RequestMapping(value = "/personsave", method= RequestMethod.POST)
	private ResponseEntity<String> saveBook(@RequestBody Person person)   
	{  
		System.out.println("inside post ");
		personservice.saveOrUpdate(person);  
	return ResponseEntity.status(HttpStatus.OK)
	        .body("Person with ID :- " + person.getId()+" is saved ");  
	}
	
	
	@RequestMapping(value = "/personsupdate", method= RequestMethod.PUT)
	private Person update(@RequestBody Person person)   
	{  
		personservice.saveOrUpdate(person);  
	return person;  
	}
	
	
}
