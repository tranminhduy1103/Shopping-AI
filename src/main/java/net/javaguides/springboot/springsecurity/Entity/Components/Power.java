package net.javaguides.springboot.springsecurity.Entity.Components;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Power {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Component;

    private String Power_Max;
    private String Quantities;

    public Power(Long id, String sub_Component, String power_Max, String quantities) {
        Id = id;
        Sub_Component = sub_Component;
        Power_Max = power_Max;
        Quantities = quantities;
    }

    public Power() {
    }

    public String getSub_Component() {
        return Sub_Component;
    }

    public void setSub_Component(String sub_Component) {
        Sub_Component = sub_Component;
    }

    public String getQuantities() {
        return Quantities;
    }

    public void setQuantities(String quantities) {
        Quantities = quantities;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPower_Max() {
        return Power_Max;
    }

    public void setPower_Max(String power_Max) {
        Power_Max = power_Max;
    }
}
