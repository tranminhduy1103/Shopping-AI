package net.javaguides.springboot.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class Origin {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String des;
    private String sl1;
    private String image1;
    private String sl2;
    private String image2;
    private String sl3;
    private String image3;
    private String sl4;
    private String image4;



    public Origin(Long id, String name, String image, String des, String sl1, String image1, String sl2, String image2, String sl3, String image3, String sl4, String image4) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.des = des;
        this.sl1 = sl1;
        this.image1 = image1;
        this.sl2 = sl2;
        this.image2 = image2;
        this.sl3 = sl3;
        this.image3 = image3;
        this.sl4 = sl4;
        this.image4 = image4;
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

    public String getSl1() {
        return sl1;
    }

    public void setSl1(String sl1) {
        this.sl1 = sl1;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getSl2() {
        return sl2;
    }

    public void setSl2(String sl2) {
        this.sl2 = sl2;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getSl3() {
        return sl3;
    }

    public void setSl3(String sl3) {
        this.sl3 = sl3;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getSl4() {
        return sl4;
    }

    public void setSl4(String sl4) {
        this.sl4 = sl4;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }
}
