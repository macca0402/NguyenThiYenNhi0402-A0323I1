package com.example.case_4.service.impl;

import com.example.case_4.entity.Customer;
import com.example.case_4.repository.IRepositoryCustomer;
import com.example.case_4.service.IServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements IServiceCustomer {
    @Autowired
    private IRepositoryCustomer repositoryCustomer;
    @Override
    public boolean create(Customer customer) {
        repositoryCustomer.save(customer);
        return true;
    }

    @Override
    public boolean update(Customer customer) {
        repositoryCustomer.save(customer);
        return true;
    }

    @Override
    public Customer findById(int id) {
        return repositoryCustomer.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findAll() {
        return repositoryCustomer.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        repositoryCustomer.deleteById(id);
        return true;
    }
}
