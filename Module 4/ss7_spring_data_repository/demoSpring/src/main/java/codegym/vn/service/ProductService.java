package codegym.vn.service;
import java.util.List;
import codegym.vn.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface ProductService extends Service<Product>{
    List<Product> findAllByName(String name);
   Page<Product> findAllAndPaging(Pageable pageable);
   Slice<Product> findAllSlice(Pageable pageable);
}
