package codegym.vn.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@NamedQueries({
        @NamedQuery(name = "findProductByName",
                query = "From Product p where p.name like :name"),
        @NamedQuery(name = "findProductByCategoryName",
                query = "From Product p where p.category.categoryName like :categoryName")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 0, message = "ID phải là số nguyên dương")
    private int id;

    @NotBlank
    @Size(min = 5, max = 15, message = "{name.size}")
    private String name;

    @Min(1)
    private int quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateRelease;
    @NumberFormat(pattern = "#.##")
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {
    }

    public Product(int id, String name, int quantity, Date dateRelease, double price, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dateRelease = dateRelease;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
