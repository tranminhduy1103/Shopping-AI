package net.javaguides.springboot.springsecurity.Entity.Hi_EndGaming;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class mouse {
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;



    private String Sub_Name;

    private String Color;

    private String Resolution;

    private String Connection_Way;

    private String Connection_Gate;

  
    private String Quantities;
    
    private String Sensor_Type;
    
    mouse() {}
    
    public mouse(Long id, String sub_Name, String color, String resolution, String connection_Way, String sensor_Type, String connection_Gate ,String quantities) {
        Id = id;
        Sub_Name = sub_Name;
    
        Color = color;
        Resolution = resolution;
        Connection_Way = connection_Way;
      
        Connection_Gate = connection_Gate;
       
        Sensor_Type = sensor_Type;
       
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

    public void setSub_Name(String sub_Name) {
        Sub_Name = sub_Name;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        Resolution = resolution;
    }


    public String getSensor_Type() {
        return Sensor_Type;
    }

    public void setSensor_Type(String sensor_Type) {
        Sensor_Type = sensor_Type; 
    }




    public String getConnection_Gate() {
        return Connection_Gate;
    }

    public void setConnection_Gate(String connection_Gate) {
        Connection_Gate= connection_Gate;
    }


    public String getConnection_Way() {
        return Connection_Way;
    }

    public void setConnection_Way(String connection_Way) {
        this.Connection_Way = connection_Way;
    }

    public String getQuatities() {
        return Quantities;
    }

    public void setQuatities(String quatities) {
        Quantities = quatities;
    }
    

}
