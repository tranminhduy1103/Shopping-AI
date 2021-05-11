package net.javaguides.springboot.springsecurity.Entity.Components;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class RAM {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Sub_Component;

    private String Capacity;

    private String Generation;

    private String Bus;
    private String Quantities;
    private String Timing;
    private String Size;

    public RAM(Long id, String sub_Component, String capacity, String generation, String bus, String quantities, String timing, String size) {
        Id = id;
        Sub_Component = sub_Component;
        Capacity = capacity;
        Generation = generation;
        Bus = bus;
        Quantities = quantities;
        Timing = timing;
        Size = size;
    }

    public RAM() {
    }

    public String getQuatities() {
        return Quantities;
    }

    public void setQuatities(String quatities) {
        Quantities = quatities;
    }

    public String getTiming() {
        return Timing;
    }

    public void setTiming(String timing) {
        Timing = timing;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
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

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public String getGeneration() {
        return Generation;
    }

    public void setGeneration(String generation) {
        Generation = generation;
    }

    public String getBus() {
        return Bus;
    }

    public void setBus(String bus) {
        Bus = bus;
    }
}
