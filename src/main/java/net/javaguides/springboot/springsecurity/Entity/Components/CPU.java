package net.javaguides.springboot.springsecurity.Entity.Components;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class CPU {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Component;


    private String Quantities;


    private String Series;

    private String CPU;


    private String Socket;


    private String Core;


    private String Thread;


    private String Code_Name;


    private String Generation;


    private String Graphic_Card;

    public CPU() {
    }


    public CPU(Long id, String sub_Component, String quantities, String series, String CPU, String socket, String processor, String thread, String code_Name, String generation, String graphic_Card) {
        Id = id;
        Sub_Component = sub_Component;
        Quantities = quantities;
        Series = series;
        this.CPU = CPU;
        Socket = socket;
        Core = processor;
        Thread = thread;
        Code_Name = code_Name;
        Generation = generation;
        Graphic_Card = graphic_Card;
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

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String socket) {
        Socket = socket;
    }

    public String getCore() {
        return Core;
    }

    public void setCore(String core) {
        Core = core;
    }

    public String getThread() {
        return Thread;
    }

    public void setThread(String thread) {
        Thread = thread;
    }

    public String getCode_Name() {
        return Code_Name;
    }

    public void setCode_Name(String code_Name) {
        Code_Name = code_Name;
    }

    public String getGeneration() {
        return Generation;
    }

    public void setGeneration(String generation) {
        Generation = generation;
    }

    public String getGraphic_Card() {
        return Graphic_Card;
    }

    public void setGraphic_Card(String graphic_Card) {
        Graphic_Card = graphic_Card;
    }
}
