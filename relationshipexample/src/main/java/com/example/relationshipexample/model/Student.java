package com.example.relationshipexample.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
      name = "student_course", 
      joinColumns = @JoinColumn(name = "student_id"), 
      inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses = new HashSet<>();
    
    public Student() {
    	
    }

	public Student(Long id, String name, Set<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
    
}
