package net.javaguides.springboot.springsecurity.Entity.Components;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Radiator {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Component;

    private String TypeR;

    private String Fan_Size;

    private String LED;

    private String Material;

    private String Color;

    private String Height;
    private String Rev_Fan;
    private String dBA;

    private String Weight;
    private String Quantities;

    public Radiator(Long id, String sub_Component, String typeR, String fan_Size, String LED, String material, String color, String height, String rev_Fan, String dBA, String weight, String quantities) {
        Id = id;
        Sub_Component = sub_Component;
        TypeR = typeR;
        Fan_Size = fan_Size;
        this.LED = LED;
        Material = material;
        Color = color;
        Height = height;
        Rev_Fan = rev_Fan;
        this.dBA = dBA;
        Weight = weight;
        Quantities = quantities;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSub_Component() {
        return Sub_Component;
    }

    public void setSub_Component(String sub_Component) {
        Sub_Component = sub_Component;
    }

    public String getTypeR() {
        return TypeR;
    }

    public void setTypeR(String typeR) {
        TypeR = typeR;
    }

    public String getFan_Size() {
        return Fan_Size;
    }

    public void setFan_Size(String fan_Size) {
        Fan_Size = fan_Size;
    }

    public String getLED() {
        return LED;
    }

    public void setLED(String LED) {
        this.LED = LED;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getRev_Fan() {
        return Rev_Fan;
    }

    public void setRev_Fan(String rev_Fan) {
        Rev_Fan = rev_Fan;
    }

    public String getdBA() {
        return dBA;
    }

    public void setdBA(String dBA) {
        this.dBA = dBA;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getQuantities() {
        return Quantities;
    }

    public void setQuantities(String quantities) {
        Quantities = quantities;
    }
}
