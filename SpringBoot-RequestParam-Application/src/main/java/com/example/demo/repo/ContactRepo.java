package com.example.demo.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.bean.ContactUsEntity;

public interface ContactRepo extends JpaRepository<ContactUsEntity, String> {

  // @Query(value="CALL customercount()" ,nativeQuery = true)
   //public List<ContactUsEntity> fecthCustomerCount();
   
   @Query(value="CALL getEmpByName(:empName)" ,nativeQuery = true)
   public List<ContactUsEntity> getEmpByName(@Param("empName") String empName);

   @Query(value="CALL customerByIdName(:cid,:cname)" ,nativeQuery = true)
   public List<ContactUsEntity> getEmpIdAndByName(@Param("cid") String cid,@Param("cname") String cname);

   @Query(value="CALL getAllCustDetails()",nativeQuery = true)
   public List<ContactUsEntity> getAllDetails();

 
  }
