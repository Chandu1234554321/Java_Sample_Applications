package com.ticket.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ticket.booking.entiry.Student;
 
public interface StudentRepo extends CrudRepository<Student, Integer> {
 
}