package net.javaguides.springboot.springsecurity.Entity.OfficeDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Printer {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Office;

    private String Ink_catridge;

    private String Integrated_memory;

    private String Papper_size;

    private String Connection_internet;

    private String Connection_gate;

    private String Velocity;

    private String Resolution;

    private String PrinterType;

    private String Feature;

    private Long Quantities;

    public Printer() {
    }

    public Printer(Long id, String sub_Office, Long quantities, String feature, String printerType, String resolution, String velocity, String connection_gate, String connection_internet, String papper_size, String integrated_memory, String ink_catridge) {
        Id = id;
        Sub_Office = sub_Office;
        Quantities = quantities;
        Feature = feature;
        PrinterType = printerType;
        Resolution = resolution;
        Velocity = velocity;
        Connection_gate = connection_gate;
        Connection_internet = connection_internet;
        Papper_size = papper_size;
        Integrated_memory = integrated_memory;
        Ink_catridge = ink_catridge;
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


public String getPrinterType() {
	return this.PrinterType;
}
public void setPrinterType(String PrinterType) {
	this.PrinterType = PrinterType;
}

public String getResolution() {
	return this.Resolution;
}
public void setResolution(String Resolution) {
	this.Resolution = Resolution;
}


public String getVelocity() {
	return this.Velocity;
}
public void setVelocity(String Velocity) {
	this.Velocity = Velocity;
}


public String getConnection_gate() {
	return this.Connection_gate;
}
public void setConnection_gate(String Connection_gate) {
	this.Connection_gate = Connection_gate;
}

public String getConnection_internet() {
	return this.Connection_internet;
}
public void setConnection_internet(String Connection_internet) {
	this.Connection_internet = Connection_internet;
}


public String getPapper_size() {
	return this.Papper_size;
}
public void setPapper_size(String Papper_size) {
	this.Papper_size = Papper_size;
}


public String getIntegrated_memory() {
	return this.Integrated_memory;
}
public void setIntegrated_memory(String Integrated_memory) {
	this.Integrated_memory = Integrated_memory;
}


 public String getInk_catridge() {
 	return this.Ink_catridge;
 }
 public void setInk_catridge(String Ink_catridge) {
 	this.Ink_catridge = Ink_catridge;
 }

}
