package com.example.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entiry.Passport;

@Repository
public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
