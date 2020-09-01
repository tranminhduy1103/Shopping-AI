package net.javaguides.springboot.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))

public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private String des;
    private String recipe1_name;
    private String recipe2_name;

    public Item() {
    }

    public Item(Long id, String name, String image, String des, String recipe1_name, String recipe2_name) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.des = des;
        this.recipe1_name = recipe1_name;
        this.recipe2_name = recipe2_name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }




    public String getRecipe1_name() {
        return recipe1_name;
    }

    public void setRecipe1_name(String recipe1_name) {
        this.recipe1_name = recipe1_name;
    }



    public String getRecipe2_name() {
        return recipe2_name;
    }

    public void setRecipe2_name(String recipe2_name) {
        this.recipe2_name = recipe2_name;
    }

}
