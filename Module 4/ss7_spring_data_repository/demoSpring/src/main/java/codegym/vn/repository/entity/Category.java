package codegym.vn.repository.entity;
import codegym.vn.entity.Product;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
public class Category {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column(name="category_name",columnDefinition = "varchar(50)")
    private String categoryName;
    @OneToMany (mappedBy = "category")
    private List<codegym.vn.entity.Product> productList;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<codegym.vn.entity.Product> getProductList() {
        return productList;
    }

    public void setProductList(List<codegym.vn.entity.Product> productList) {
        this.productList = productList;
    }

    public Category() {
    }

    public Category(String categoryName, List<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

}
