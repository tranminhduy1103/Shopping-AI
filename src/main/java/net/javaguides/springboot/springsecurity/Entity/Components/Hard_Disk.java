package net.javaguides.springboot.springsecurity.Entity.Components;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Hard_Disk {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Sub_Component;
    private String Quantities;

    private String Capacity;

    private String Connection;

    private String Size;

    private String Read_Speed;

    private String Write_Speed;
    private String Rev_Speed;

    public Hard_Disk() {
    }

    public Hard_Disk(Long id, String sub_Component, String quantities, String capacity, String connection, String size, String read_Speed, String write_Speed, String rev_Speed) {
        Id = id;
        Sub_Component = sub_Component;
        Quantities = quantities;
        Capacity = capacity;
        Connection = connection;
        Size = size;
        Read_Speed = read_Speed;
        Write_Speed = write_Speed;
        Rev_Speed = rev_Speed;
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

    public String getQuantities() {
        return Quantities;
    }

    public void setQuantities(String quantities) {
        Quantities = quantities;
    }

    public String getRev_Speed() {
        return Rev_Speed;
    }

    public void setRev_Speed(String rev_Speed) {
        Rev_Speed = rev_Speed;
    }

    public String getQuatities() {
        return Quantities;
    }

    public void setQuatities(String quatities) {
        Quantities = quatities;
    }


    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public String getConnection() {
        return Connection;
    }

    public void setConnection(String connection) {
        Connection = connection;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getRead_Speed() {
        return Read_Speed;
    }

    public void setRead_Speed(String read_Speed) {
        Read_Speed = read_Speed;
    }

    public String getWrite_Speed() {
        return Write_Speed;
    }

    public void setWrite_Speed(String write_Speed) {
        Write_Speed = write_Speed;
    }
}
