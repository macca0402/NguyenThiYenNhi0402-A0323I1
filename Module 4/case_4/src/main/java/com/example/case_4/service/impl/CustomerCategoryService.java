package com.example.case_4.service.impl;

import com.example.case_4.entity.CustomerCategory;
import com.example.case_4.repository.IRepositoryCustomerCategory;
import com.example.case_4.service.IServiceCustomerCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCategoryService implements IServiceCustomerCategory {
    @Autowired
    private IRepositoryCustomerCategory repositoryCustomerCategory;
    @Override
    public boolean create(CustomerCategory customerCategory) {
        repositoryCustomerCategory.save(customerCategory);
        return true;
    }

    @Override
    public boolean update(CustomerCategory customerCategory) {
        return false;
    }

    @Override
    public CustomerCategory findById(int id) {
        return null;
    }

    @Override
    public List<CustomerCategory> findAll() {
        return repositoryCustomerCategory.findAll() ;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
