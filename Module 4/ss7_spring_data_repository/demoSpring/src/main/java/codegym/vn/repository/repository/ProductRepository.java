package codegym.vn.repository.repository;

import codegym.vn.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface ProductRepository extends JpaRepository<codegym.vn.repository.entity.Product,Integer> {
    List<codegym.vn.repository.entity.Product> findAllByNameContaining(String name);
    @Query("from Product p where p.name like :name")
    public List<codegym.vn.repository.entity.Product> search(@Param("name") String name);
}
