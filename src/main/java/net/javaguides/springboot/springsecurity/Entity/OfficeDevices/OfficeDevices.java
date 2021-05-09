package net.javaguides.springboot.springsecurity.Entity.OfficeDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class OfficeDevices {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Type;

    private String ImageID;

    private String Guarantee_info;

    private String Sub_Office;

    private String Supplier;

    private String Price;

    private String Name;

    public OfficeDevices() {
    }

    public OfficeDevices(Long id, String name, String type, String imageID, String guarantee_info, String sub_Office, String supplier, String price) {
        Id = id;
        Name = name;
        Type = type;
        ImageID = imageID;
        Guarantee_info = guarantee_info;
        Sub_Office = sub_Office;
        Supplier = supplier;
        Price = price;
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


 public String getSupplier() {
 	return this.Supplier;
 }
 public void setSupplier(String Supplier) {
 	this.Supplier = Supplier;
 }


public String getSub_Office() {
	return this.Sub_Office;
}
public void setSub_Office(String Sub_Office) {
	this.Sub_Office = Sub_Office;
}


  public String getGuarantee_info() {
  	return this.Guarantee_info;
  }
  public void setGuarantee_info(String Guarantee_info) {
  	this.Guarantee_info = Guarantee_info;
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
