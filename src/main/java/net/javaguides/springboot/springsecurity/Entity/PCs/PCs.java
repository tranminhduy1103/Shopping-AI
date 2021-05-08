package net.javaguides.springboot.springsecurity.Entity.PCs;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class PCs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty
    @Column(nullable = false)
    private String Name;

    @NotEmpty
    @Column(nullable = false)
    private String Price;

    @NotEmpty
    @Column(nullable = false)
    private String Product_Supplier;

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
    private String Description;

    @NotEmpty
    @Column(nullable = false)
    private String Quatity;

    @NotEmpty
    @Column(nullable = false)
    private String ImageID;

    @NotEmpty
    @Column(nullable = false)
    private String Type;

    @NotEmpty
    @Column(nullable = false)
    private String Other_info;


    public PCs() {
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
        return Product_Supplier;
    }

    public void setProduct_Supplier(String product_Supplier) {
        Product_Supplier = product_Supplier;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getQuatity() {
        return Quatity;
    }

    public void setQuatity(String quatity) {
        Quatity = quatity;
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
