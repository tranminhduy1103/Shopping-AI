package net.javaguides.springboot.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))

public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String des;
    private String recipe1_image;
    private String recipe1_name;
    private String recipe1_des;
    private String recipe2_image;
    private String recipe2_name;
    private String recipe2_des;

    public Item() {
    }

    public Item(Long id, String name, String image, String des, String recipe1_image, String recipe1_name, String recipe1_des, String recipe2_image, String recipe2_name, String recipe2_des) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.des = des;
        this.recipe1_image = recipe1_image;
        this.recipe1_name = recipe1_name;
        this.recipe1_des = recipe1_des;
        this.recipe2_image = recipe2_image;
        this.recipe2_name = recipe2_name;
        this.recipe2_des = recipe2_des;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRecipe1_image() {
        return recipe1_image;
    }

    public void setRecipe1_image(String recipe1_image) {
        this.recipe1_image = recipe1_image;
    }

    public String getRecipe1_name() {
        return recipe1_name;
    }

    public void setRecipe1_name(String recipe1_name) {
        this.recipe1_name = recipe1_name;
    }

    public String getRecipe1_des() {
        return recipe1_des;
    }

    public void setRecipe1_des(String recipe1_des) {
        this.recipe1_des = recipe1_des;
    }

    public String getRecipe2_image() {
        return recipe2_image;
    }

    public void setRecipe2_image(String recipe2_image) {
        this.recipe2_image = recipe2_image;
    }

    public String getRecipe2_name() {
        return recipe2_name;
    }

    public void setRecipe2_name(String recipe2_name) {
        this.recipe2_name = recipe2_name;
    }

    public String getRecipe2_des() {
        return recipe2_des;
    }

    public void setRecipe2_des(String recipe2_des) {
        this.recipe2_des = recipe2_des;
    }
}
