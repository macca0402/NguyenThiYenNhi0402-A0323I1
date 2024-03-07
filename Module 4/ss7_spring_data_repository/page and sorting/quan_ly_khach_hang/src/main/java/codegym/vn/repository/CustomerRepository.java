package codegym.vn.repository;

import codegym.vn.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long>,CrudRepository<Customer,Long> {
}
