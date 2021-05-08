package net.javaguides.springboot.springsecurity.Entity.OfficeDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Projectors {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Office;

    private Long Quantities;

    private String Weight;

    private String Feature;

    private String Connection_way;

    private String Color;

    private String Contrast;

    private String Light_age;

    private String Resolution;

    private String Brightness;

    public Projectors() {
    }

    public Projectors(Long id, String sub_Office, Long quantities, String brightness, String resolution, String light_age, String contrast, String color, String connection_way, String feature, String weight) {
        Id = id;
        Sub_Office = sub_Office;
        Quantities = quantities;
        Brightness = brightness;
        Resolution = resolution;
        Light_age = light_age;
        Contrast = contrast;
        Color = color;
        Connection_way = connection_way;
        Feature = feature;
        Weight = weight;
    }


public String getSub_Office() {
	return this.Sub_Office;
}
public void setSub_Office(String Sub_Office) {
	this.Sub_Office = Sub_Office;
}

public Long getQuantities() {
	return this.Quantities;
}
public void setQuantities(Long Quantities) {
	this.Quantities = Quantities;
}

public String getBrightness() {
    return this.Brightness;
}
public void setBrightness(String Brightness) {
    this.Brightness = Brightness;
}

public String getResolution() {
    return this.Resolution;
}
public void setResolution(String Resolution) {
    this.Resolution = Resolution;
}

public String getLight_age() {
    return this.Light_age;
}
public void setLight_age(String Light_age) {
    this.Light_age = Light_age;
}

public String getContrast() {
    return this.Contrast;
}
public void setContrast(String Contrast) {
    this.Contrast = Contrast;
}

public String getColor() {
    return this.Color;
}
public void setColor(String Color) {
    this.Color = Color;
}

public String getConnection_way() {
    return this.Connection_way;
}
public void setConnection_way(String Connection_way) {
    this.Connection_way = Connection_way;
}

public String getFeature() {
    return this.Feature;
}
public void setFeature(String Feature) {
    this.Feature = Feature;
}

public String getWeight() {
    return this.Weight;
}
public void setWeight(String Weight) {
    this.Weight = Weight;
}

}
