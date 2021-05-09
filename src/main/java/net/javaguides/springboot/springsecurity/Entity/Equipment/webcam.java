package net.javaguides.springboot.springsecurity.Entity.Equipment;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class webcam {
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;



    private String Sub_Name;

    private String Color;

    private String OperatingSystem;

    private String FPS;

    private String Connection_Gate;

  
    private String Resolution;
    private String Quantities;
    private String Size;
    
    private String Weight;
    private String Feature;
    
    public webcam() {}
    
    public webcam(Long id, String resolution, String sub_Name, String color, String size, String fps,
    		String operatingSystem, String feature, String range, String connection_Gate ,String quantities) {
    	Id = id;
        Sub_Name = sub_Name;
        Resolution = resolution;
    
        Color = color;
        OperatingSystem = operatingSystem;
        FPS = fps;
      
        Connection_Gate = connection_Gate;
       
        Weight = range;
        Size = size;
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

	public String getFPS() {
		return FPS;
	}

	public void setFPS(String fPS) {
		FPS = fPS;
	}

	public String getConnection_Gate() {
		return Connection_Gate;
	}

	public void setConnection_Gate(String connection_Gate) {
		Connection_Gate = connection_Gate;
	}

	public String getResolution() {
		return Resolution;
	}

	public void setResolution(String resolution) {
		Resolution = resolution;
	}

	public String getQuantities() {
		return Quantities;
	}

	public void setQuantities(String quantities) {
		Quantities = quantities;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getFeature() {
		return Feature;
	}

	public void setFeature(String feature) {
		Feature = feature;
	}

}
