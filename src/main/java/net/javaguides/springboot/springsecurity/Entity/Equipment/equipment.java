package net.javaguides.springboot.springsecurity.Entity.Equipment;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class equipment {
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private String Name;


    private String Price;


    private String Sub_Name;

    private String Supplier;


    private String Guarantee_info;




    private String Image_ID;
    private String Type;


    public equipment() {
    }

    public equipment(Long id, String name, String price, String sub_Name, String supplier, String guarantee_info, String image_ID, String type) {
        Id = id;
        Name = name;
        Price = price;
        Sub_Name = sub_Name;
        Supplier = supplier;
        Guarantee_info = guarantee_info;
        
        Image_ID = image_ID;
        Type = type;
     
    }

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getSub_Name() {
		return Sub_Name;
	}

	public void setSub_Name(String sub_Name) {
		Sub_Name = sub_Name;
	}

	public String getSupplier() {
		return Supplier;
	}

	public void setSupplier(String supplier) {
		Supplier = supplier;
	}

	public String getGuarantee_info() {
		return Guarantee_info;
	}

	public void setGuarantee_info(String guarantee_info) {
		Guarantee_info = guarantee_info;
	}

	public String getImage_ID() {
		return Image_ID;
	}

	public void setImage_ID(String image_ID) {
		Image_ID = image_ID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}
