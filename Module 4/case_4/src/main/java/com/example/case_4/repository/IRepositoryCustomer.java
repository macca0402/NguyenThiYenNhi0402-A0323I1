package com.example.case_4.repository;

import com.example.case_4.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCustomer extends JpaRepository<Customer,Integer> {
}
