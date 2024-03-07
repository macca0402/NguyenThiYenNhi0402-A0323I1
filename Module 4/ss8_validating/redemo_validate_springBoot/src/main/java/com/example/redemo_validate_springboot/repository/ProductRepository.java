package com.example.redemo_validate_springboot.repository;



import com.example.redemo_validate_springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findAllByNameContaining(String name);
    @Query("from Product p where p.name like :name")
    public List<Product> search(@Param("name") String name);
}
