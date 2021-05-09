package net.javaguides.springboot.springsecurity.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))

public class ProductTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private int Price;

    @NotEmpty
    @Column(nullable = false)
    private String Product_Supplier;

    public ProductTest(){}

    public ProductTest(Long id, String Name, int Price, String Product_Supplier){
        this.id = id;
        this.Name = Name;
        this.Price = Price;
        this.Product_Supplier = Product_Supplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getProduct_Supplier() {
        return Product_Supplier;
    }

    public void setProduct_Supplier(String product_Supplier) {
        Product_Supplier = product_Supplier;
    }
}
