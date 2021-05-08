package net.javaguides.springboot.springsecurity.Entity.Hi_EndGaming;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class mousepad {
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;



    private String Sub_Name;

    private String Color;

    private String Material;

    private String Size;

    private String Size_Type;

  
    private String Quantities;
    
    private String Series;
    
    public mousepad() {}
    
    public mousepad(Long id, String sub_Name, String color, String material, String size, String series, String size_Type ,String quantities) {
        Id = id;
        Sub_Name = sub_Name;
    
        Color = color;
        Material = material;
        Size = size;
      
        Size_Type = size_Type;
       
        Series = series;
       
        Quantities = quantities;
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

    public String getSub_Name() {
        return Sub_Name;
    }

    public void setSub_Component(String sub_Name) {
        Sub_Name = sub_Name;
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




    public String getSizeType() {
        return Size_Type;
    }

    public void setSizeType(String size_Type) {
        Size_Type= size_Type;
    }


    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        this.Series = series;
    }

    public String getQuatities() {
        return Quantities;
    }

    public void setQuatities(String quatities) {
        Quantities = quatities;
    }


}


