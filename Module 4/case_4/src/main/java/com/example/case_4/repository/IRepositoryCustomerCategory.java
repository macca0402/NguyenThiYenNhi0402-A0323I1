package com.example.case_4.repository;

import com.example.case_4.entity.Customer;
import com.example.case_4.entity.CustomerCategory;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCustomerCategory extends JpaRepository<CustomerCategory, Integer> {
}
