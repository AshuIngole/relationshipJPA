package com.example.relationshipexample.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "address_id", referencedColumnName = "id")
 private Address address;
 public Person() {
	 
 }
public Person(Long id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
 
}
