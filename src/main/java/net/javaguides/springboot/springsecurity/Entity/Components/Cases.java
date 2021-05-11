package net.javaguides.springboot.springsecurity.Entity.Components;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Cases {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Component;


    private String Case_Name;

    private String Color;

    private String Material;

    private String Size;

    private String MainBoard_Supply;

    private String Connection_Gate;

    private String Radiator_Supply;

    private String TypeFan;

    private String FanFoward_Supply;

    private String FanBackward_Supply;

    private String FanSide_Supply;

    private String PCISlot;
    private String Quantities;

    public Cases() {
    }

    public Cases(Long id, String sub_Component, String case_Name, String color, String material, String size, String mainBoard_Supply, String connection_Gate, String radiator_Supply, String typeFan, String fanFoward_Supply, String fanBackward_Supply, String fanSide_Supply, String PCISlot, String quantities) {
        Id = id;
        Sub_Component = sub_Component;
        Case_Name = case_Name;
        Color = color;
        Material = material;
        Size = size;
        MainBoard_Supply = mainBoard_Supply;
        Connection_Gate = connection_Gate;
        Radiator_Supply = radiator_Supply;
        TypeFan = typeFan;
        FanFoward_Supply = fanFoward_Supply;
        FanBackward_Supply = fanBackward_Supply;
        FanSide_Supply = fanSide_Supply;
        this.PCISlot = PCISlot;
        Quantities = quantities;
    }

    public String getMainBoard_Supply() {
        return MainBoard_Supply;
    }

    public void setMainBoard_Supply(String mainBoard_Supply) {
        MainBoard_Supply = mainBoard_Supply;
    }

    public String getFanFoward_Supply() {
        return FanFoward_Supply;
    }

    public void setFanFoward_Supply(String fanFoward_Supply) {
        FanFoward_Supply = fanFoward_Supply;
    }

    public String getFanBackward_Supply() {
        return FanBackward_Supply;
    }

    public void setFanBackward_Supply(String fanBackward_Supply) {
        FanBackward_Supply = fanBackward_Supply;
    }

    public String getFanSide_Supply() {
        return FanSide_Supply;
    }

    public void setFanSide_Supply(String fanSide_Supply) {
        FanSide_Supply = fanSide_Supply;
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

    public String getSub_Component() {
        return Sub_Component;
    }

    public void setSub_Component(String sub_Component) {
        Sub_Component = sub_Component;
    }

    public String getCase_Name() {
        return Case_Name;
    }

    public void setCase_Name(String case_Name) {
        Case_Name = case_Name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }


    public String getConnection_Gate() {
        return Connection_Gate;
    }

    public void setConnection_Gate(String connection_Gate) {
        Connection_Gate = connection_Gate;
    }

    public String getRadiator_Supply() {
        return Radiator_Supply;
    }

    public void setRadiator_Supply(String radiator_Supply) {
        Radiator_Supply = radiator_Supply;
    }

    public String getTypeFan() {
        return TypeFan;
    }

    public void setTypeFan(String typeFan) {
        TypeFan = typeFan;
    }


    public String getPCISlot() {
        return PCISlot;
    }

    public void setPCISlot(String PCISlot) {
        this.PCISlot = PCISlot;
    }

    public String getQuatities() {
        return Quantities;
    }

    public void setQuatities(String quatities) {
        Quantities = quatities;
    }


}
