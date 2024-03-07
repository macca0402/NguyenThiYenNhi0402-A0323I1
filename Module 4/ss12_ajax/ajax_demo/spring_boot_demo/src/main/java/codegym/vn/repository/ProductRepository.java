package codegym.vn.repository;

import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findAllByNameContaining(String name);
    @Query("From Product p where p.name like :name")
    public List<Product> search(@Param("name") String name);

}
