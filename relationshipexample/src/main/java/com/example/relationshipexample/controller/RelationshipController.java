package com.example.relationshipexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationshipexample.model.Person;
import com.example.relationshipexample.model.Post;
import com.example.relationshipexample.model.Student;
import com.example.relationshipexample.service.RelationshipService;

//RelationshipController.java
@RestController
@RequestMapping("/api/relationships")
public class RelationshipController {
 @Autowired
 private RelationshipService relationshipService;

 @GetMapping("/onetoonedemo")
 public List<Person> getOneToOneDemo() {
     return relationshipService.getOneToOneDemo();
 }

 @GetMapping("/onetomanydemo")
 public List<Post> getOneToManyDemo() {
     return relationshipService.getOneToManyDemo();
 }

 @GetMapping("/manytomanydemo")
 public List<Student> getManyToManyDemo() {
     return relationshipService.getManyToManyDemo();
 }
}

