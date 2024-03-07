package codegym.vn.service;

import codegym.vn.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Customer findById(long id);
    void save(Customer customer);

    Page<Customer> findAll(Pageable pageable);

}
