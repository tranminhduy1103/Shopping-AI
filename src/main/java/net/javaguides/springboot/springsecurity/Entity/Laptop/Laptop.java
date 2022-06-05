package net.javaguides.springboot.springsecurity.Entity.Laptop;

import javax.persistence.*;

@Entity
@Table(name = "laptop",uniqueConstraints = @UniqueConstraint(columnNames = "Id"))

public class Laptop {
    //Laptop(Id,Name,Price,Supplier,cpu,Screen,RAM,Graphics,Storage,Operating_System,Cell,Weight,
    //Description, `Guarantee-info`, color, `Other-info`, ImageID,Type)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="Name", length = 255 )
    private String Name;
    
    @Column(name ="Price")
    private double Price;
    
    @Column(name ="Supplier", length = 255 )
    private String Supplier;

    @Column(name ="CPU", length = 255 )
    private String CPU;

    @Column(name ="Screen", length = 255 )
    private String Screen;
    
    @Column(name ="RAM", length = 255 )
    private String RAM;

    @Column(name ="Graphics", length = 255 )
    private String Graphics;

    @Column(name ="Storage", length = 255 )
    private String Storage;

    @Column(name ="OperatingSystem", length = 255 )
    private String Operating_System;

    @Column(name ="Cell", length = 255 )
    private String Cell;

    @Column(name ="Weight", length = 255 )
    private String Weight;

    @Column(name ="GuaranteeInfo", length = 255 )
    private String Guarantee_info;

    @Column(name ="Color", length = 255 )
    private String Color;

    @Column(name ="OtherInfo", length = 255 )
    private String Other_info;

    @Column(name ="ImageID", length = 255 )
    private String ImageID;

    @Column(name ="Type", length = 255 )
    private String Type;
    
    @Column(name ="Description", length = 255 )
    private String Description;

    public Laptop() {
    }

    public Laptop(Long id, String name, float price, String supplier, String CPU, String screen, String RAM, String graphics, String storage, String operating_System, String cell, String weight, String guarantee_info, String color, String other_info, String imageID, String type, String description) {
        this.id = id;
        Name = name;
        Price = price;
        Supplier = supplier;
        this.CPU = CPU;
        Screen = screen;
        this.RAM = RAM;
        Graphics = graphics;
        Storage = storage;
        Operating_System = operating_System;
        Cell = cell;
        Weight = weight;
        Guarantee_info = guarantee_info;
        Color = color;
        Other_info = other_info;
        ImageID = imageID;
        Type = type;
        Description = description;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getProduct_Supplier() {
        return Supplier;
    }

    public void setProduct_Supplier(String Supplier) {
        Supplier = Supplier;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String screen) {
        Screen = screen;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGraphics() {
        return Graphics;
    }

    public void setGraphics(String graphics) {
        Graphics = graphics;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getOperating_System() {
        return Operating_System;
    }

    public void setOperating_System(String operating_System) {
        Operating_System = operating_System;
    }

    public String getCell() {
        return Cell;
    }

    public void setCell(String cell) {
        Cell = cell;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getGuarantee_info() {
        return Guarantee_info;
    }

    public void setGuarantee_info(String guarantee_info) {
        Guarantee_info = guarantee_info;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getImageID() {
        return ImageID;
    }

    public void setImageID(String imageID) {
        ImageID = imageID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getOther_info() {
        return Other_info;
    }

    public void setOther_info(String other_info) {
        Other_info = other_info;
    }


}
