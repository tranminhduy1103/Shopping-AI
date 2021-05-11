package net.javaguides.springboot.springsecurity.Entity.SoundDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class SoundDevices {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Name;

    private String Price;

    private String Sub_sound;

    private Long Quantities;

    private String Bass;

    private String Equalizer;

    private String Guarantee_info;

    private String Feature;

    private String Color;

    private String ImageID;

    private String Type;
    private String Image_ID;

    public String getImage_ID() {
        return Image_ID;
    }

    public void setImage_ID(String image_ID) {
        Image_ID = image_ID;
    }

    public SoundDevices() {
    }

    public SoundDevices(Long id, String name, String price, String sub_sound, Long quantities, String bass, String equalizer, String guarantee_info, String feature, String color, String image_ID, String type) {
        Id = id;
        Name = name;
        Price = price;
        Sub_sound = sub_sound;
        Quantities = quantities;
        Bass = bass;
        Equalizer = equalizer;
        Guarantee_info = guarantee_info;
        Feature = feature;
        Color = color;
        Image_ID = image_ID;
        Type = type;
    }
    public Long getId() {
        return this.Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPrice() {
        return this.Price;
    }
    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    public String getSub_sound() {
        return this.Sub_sound;
    }
    public void setSub_sound(String Sub_sound) {
        this.Sub_sound = Sub_sound;
    }
   
    public Long getQuantities() {
        return this.Quantities;
    }
    public void setQuantities(Long Quantities) {
        this.Quantities = Quantities;
    }
    
    public String getBass() {
        return this.Bass;
    }
    public void setBass(String Bass) {
        this.Bass = Bass;
    }

    public String getEqualizer() {
        return this.Equalizer;
    }
    public void setEqualizer(String Equalizer) {
        this.Equalizer = Equalizer;
    }
    
    public String getGuarantee_info() {
        return this.Guarantee_info;
    }
    public void setGuarantee_info(String Guarantee_info) {
        this.Guarantee_info = Guarantee_info;
    }
  
    public String getFeature() {
        return this.Feature;
    }
    public void setFeature(String Feature) {
        this.Feature = Feature;
    }
    
    public String getColor() {
        return this.Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getImageID() {
        return this.ImageID;
    }
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    public String getType() {
        return this.Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }

}
