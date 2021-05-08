package net.javaguides.springboot.springsecurity.Entity.Laptop;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class Laptop {
	//Laptop(Id,Name,Price,Supplier,cpu,Screen,RAM,Graphics,Storage,Operating_System,Cell,Weight,
	//Description, `Guarantee-info`, color, `Other-info`, ImageID,Type)
	
	private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String Name;

    @NotEmpty
    @Column(nullable = false)
    private String Price;

    @NotEmpty
    @Column(nullable = false)
    private String Supplier;

    @NotEmpty
    @Column(nullable = false)
    private String CPU;

    @NotEmpty
    @Column(nullable = false)
    private String Screen;

    @Column(nullable = false)
    private String RAM;

    @Column(nullable = false)
    private String Graphics;

    @NotEmpty
    @Column(nullable = false)
    private String Storage;

    @NotEmpty
    @Column(nullable = false)
    private String Operating_System;

    @NotEmpty
    @Column(nullable = false)
    private String Cell;

    @NotEmpty
    @Column(nullable = false)
    private String Weight;

    @NotEmpty
    @Column(nullable = false)
    private String Guarantee_info;

    @NotEmpty
    @Column(nullable = false)
    private String Color;

    @NotEmpty
    @Column(nullable = false)
    private String Other_info;

    @NotEmpty
    @Column(nullable = false)
    private String ImageID;

    @NotEmpty
    @Column(nullable = false)
    private String Type;
    
    public Laptop() {
    }

    ;

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

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
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
