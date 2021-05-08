package net.javaguides.springboot.springsecurity.Entity.OfficeDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Equips {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Office;

    private Long Quantities;

    private String Feature;

    public Equips() {
    }

    public Equips(Long id, String sub_Office, Long quantities, String feature) {
        Id = id;
        Sub_Office = sub_Office;
        Quantities = quantities;
        Feature = feature;
    }

public String getName() {
	return this.Name;
}
public void setName(String Name) {
	this.Name = Name;
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

public String getFeature() {
	return this.Feature;
}
public void setFeature(String Feature) {
	this.Feature = Feature;
}

}
