package net.javaguides.springboot.springsecurity.model;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private String des;
    private String dame;

    public Skill(Long id, String name, String image, String des, String dame) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.des = des;
        this.dame = dame;
    }
public Skill(){}


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

    public String getDame() {
        return dame;
    }

    public void setDame(String dame) {
        this.dame = dame;
    }
}
