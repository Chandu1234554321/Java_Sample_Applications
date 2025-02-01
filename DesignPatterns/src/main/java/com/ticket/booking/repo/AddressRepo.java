package com.ticket.booking.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticket.booking.entiry.Address;
 
@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {
 
}