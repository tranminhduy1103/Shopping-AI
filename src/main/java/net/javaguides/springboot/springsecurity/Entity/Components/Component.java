package net.javaguides.springboot.springsecurity.Entity.Components;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Component {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Name;


    private String Price;


    private String Sub_Component;

    private String Supplier;


    private String Guarantee_info;


    private String Other_info;


    private String Image_ID;
    private String Type;
    private String Description;

    public Component() {
    }

    public Component(Long id, String name, String price, String sub_Component, String supplier, String guarantee_info, String other_info, String image_ID, String type, String description) {
        Id = id;
        Name = name;
        Price = price;
        Sub_Component = sub_Component;
        Supplier = supplier;
        Guarantee_info = guarantee_info;
        Other_info = other_info;
        Image_ID = image_ID;
        Type = type;
        Description = description;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getGuarantee_info() {
        return Guarantee_info;
    }

    public void setGuarantee_info(String guarantee_info) {
        Guarantee_info = guarantee_info;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getSub_Component() {
        return Sub_Component;
    }

    public void setSub_Component(String sub_Component) {
        Sub_Component = sub_Component;
    }


    public String getOther_info() {
        return Other_info;
    }

    public void setOther_info(String other_info) {
        Other_info = other_info;
    }

    public String getImage_ID() {
        return Image_ID;
    }

    public void setImage_ID(String image_ID) {
        Image_ID = image_ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


}
