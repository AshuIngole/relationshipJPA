package com.example.relationshipexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationshipexample.model.Person;
import com.example.relationshipexample.model.Post;
import com.example.relationshipexample.model.Student;
import com.example.relationshipexample.repository.RelationshipRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.relationshipexample.model.Person;
import com.example.relationshipexample.model.Post;
import com.example.relationshipexample.model.Student;
import com.example.relationshipexample.repository.RelationshipRepository;

import java.util.List;

@Service
public class RelationshipService {
    @Autowired
    private RelationshipRepository relationshipRepository;

    public List<Person> getOneToOneDemo() {
        return relationshipRepository.findAll();
    }

    public List<Post> getOneToManyDemo() {
        return relationshipRepository.findAllPosts();
    }

    public List<Student> getManyToManyDemo() {
        return relationshipRepository.findAllStudents();
    }
}
