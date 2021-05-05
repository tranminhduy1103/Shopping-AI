package net.javaguides.springboot.springsecurity.Entity.Components;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Graphic_Card {


    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Sub_Component;


    private String Quantities;

    private String Series;


    private String GPU;
    private String GPU_Rate;


    private String PCI;

    private String Connection_Gate;


    private String Radiators;

    private String Power_Supply;


    private String Power;

    private String Size;

    public Graphic_Card() {
    }

    public Graphic_Card(Long id, String sub_Component, String quantities, String series, String GPU, String GPU_Rate, String PCI, String connection_Gate, String radiators, String power_Supply, String power, String size) {
        Id = id;
        Sub_Component = sub_Component;
        Quantities = quantities;
        Series = series;
        this.GPU = GPU;
        this.GPU_Rate = GPU_Rate;
        this.PCI = PCI;
        Connection_Gate = connection_Gate;
        Radiators = radiators;
        Power_Supply = power_Supply;
        Power = power;
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

    public String getQualities() {
        return Quantities;
    }

    public void setQualities(String qualities) {
        Quantities = qualities;
    }

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getPCI() {
        return PCI;
    }

    public void setPCI(String PCI) {
        this.PCI = PCI;
    }


    public String getGPU_Rate() {
        return GPU_Rate;
    }

    public void setGPU_Rate(String GPU_Rate) {
        this.GPU_Rate = GPU_Rate;
    }

    public String getPower_Supply() {
        return Power_Supply;
    }

    public void setPower_Supply(String power_Supply) {
        Power_Supply = power_Supply;
    }

    public String getConnection_Gate() {
        return Connection_Gate;
    }

    public void setConnection_Gate(String connection_Gate) {
        Connection_Gate = connection_Gate;
    }

    public String getRadiators() {
        return Radiators;
    }

    public void setRadiators(String radiators) {
        Radiators = radiators;
    }

    public String getPowerSupply() {
        return Power_Supply;
    }

    public void setPowerSupply(String powerSupply) {
        Power_Supply = powerSupply;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
