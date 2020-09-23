package net.javaguides.springboot.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private String des;
    private String sl1;
    private String sl2;
    private String sl3;
    private String sl4;
    private String num1;
    private String num2;
    private String num3;
    private String num4;


    public Class(){}

    public Class(Long id, String name, String image, String des, String sl1, String sl2, String sl3, String sl4) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.des = des;
        this.sl1 = sl1;
        this.sl2 = sl2;
        this.sl3 = sl3;
        this.sl4 = sl4;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getNum3() {
        return num3;
    }

    public void setNum3(String num3) {
        this.num3 = num3;
    }

    public String getNum4() {
        return num4;
    }

    public void setNum4(String num4) {
        this.num4 = num4;
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


    public String getSl2() {
        return sl2;
    }

    public void setSl2(String sl2) {
        this.sl2 = sl2;
    }


    public String getSl3() {
        return sl3;
    }

    public void setSl3(String sl3) {
        this.sl3 = sl3;
    }


    public String getSl4() {
        return sl4;
    }

    public void setSl4(String sl4) {
        this.sl4 = sl4;
    }


}
