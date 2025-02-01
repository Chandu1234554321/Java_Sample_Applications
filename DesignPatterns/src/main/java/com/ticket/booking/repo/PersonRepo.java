package com.ticket.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.booking.entiry.Person;


@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
