package com.example.relationshipexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.relationshipexample.model.Person;
import com.example.relationshipexample.model.Post;
import com.example.relationshipexample.model.Student;

//RelationshipRepository.java
public interface RelationshipRepository extends JpaRepository<Person, Long> {
 @Query("SELECT s FROM Student s LEFT JOIN FETCH s.courses")
 List<Student> findAllStudents();

 // other query methods...

 // If you want to fetch Posts with comments eagerly
 @Query("SELECT p FROM Post p LEFT JOIN FETCH p.comments")
 List<Post> findAllPosts();

 // If you need more query methods for fetching data...
}
