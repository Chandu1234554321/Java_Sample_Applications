package com.example.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entiry.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
