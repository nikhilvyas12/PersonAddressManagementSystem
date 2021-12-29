package com.pam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	//mark id as primary key
	@Id
	//defining id as column name
	@Column
	private int id;
	//defining name as column name
	@Column
	private String personName;
	//defining address  as column name
	@Column
	private String  personAdress;
	//defining city name as column name
	@Column
	private String personCity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAdress() {
		return personAdress;
	}
	public void setPersonAdress(String personAdress) {
		this.personAdress = personAdress;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
			
}
