package net.javaguides.springboot.springsecurity.Entity.Hi_EndGaming;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Keyboard {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Sub_Name;

    private String Color;

    private String Size;

    private String Connection_Way;

    private String Connection_Gate;

  
    private String Quantities;
    
    private String KeyBoard_Type;

    public Keyboard() {
    }

    public Keyboard(Long id, String sub_Name, String color, String size, String connection_Way, String keyboard_Type, String connection_Gate, String quantities) {
        Id = id;
        Sub_Name = sub_Name;

        Color = color;
        Size = size;
        Connection_Way = connection_Way;

        Connection_Gate = connection_Gate;

        KeyBoard_Type = keyboard_Type;
       
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

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
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

	public String getKeyBoard_Type() {
		return KeyBoard_Type;
	}

	public void setKeyBoard_Type(String keyBoard_Type) {
		KeyBoard_Type = keyBoard_Type;
	}
    
  
    

}


