package net.javaguides.springboot.springsecurity.Entity.PCs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//nhận và tạo 1 cái table tương ứng trong database
@Entity
public class PC_test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product_supplier;
    private String name;
    private String RAM;
    private String image;

    public PC_test() {
    }

    public PC_test(Long id, String name, String product_supplier, String RAM, String image) {
        this.id = id;
        this.name = name;
        this.product_supplier = product_supplier;
        this.RAM = RAM;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_supplier() {
        return product_supplier;
    }

    public void setProduct_supplier(String product_supplier) {
        this.product_supplier = product_supplier;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
