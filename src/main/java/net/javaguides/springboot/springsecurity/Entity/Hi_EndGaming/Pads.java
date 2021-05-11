package net.javaguides.springboot.springsecurity.Entity.Hi_EndGaming;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Pads {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Sub_Name;

    private String Color;

    private String OperatingSystem;

    private String Connection_Way;

    private String Connection_Gate;

  
    private String Quantities;
    
    private String Range;

    public Pads() {
    }

    public Pads(Long id, String sub_Name, String color, String operatingSystem, String connection_Way, String range, String connection_Gate, String quantities) {
        Id = id;
        Sub_Name = sub_Name;

        Color = color;
        OperatingSystem = operatingSystem;
        Connection_Way = connection_Way;

        Connection_Gate = connection_Gate;

        Range = range;
       
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

	public void setSub_Name(String sub_Name) {
		Sub_Name = sub_Name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}

	public String getConnection_Way() {
		return Connection_Way;
	}

	public void setConnection_Way(String connection_Way) {
		Connection_Way = connection_Way;
	}

	public String getConnection_Gate() {
		return Connection_Gate;
	}

	public void setConnection_Gate(String connection_Gate) {
		Connection_Gate = connection_Gate;
	}

	public String getQuantities() {
		return Quantities;
	}

	public void setQuantities(String quantities) {
		Quantities = quantities;
	}

	public String getRange() {
		return Range;
	}

	public void setRange(String range) {
		Range = range;
	}
}
