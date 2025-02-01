package com.ticket.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticket.booking.entiry.Passport;


@Repository
public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
