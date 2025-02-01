package com.example.security.repo;

import com.example.security.entiry.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {
 
}