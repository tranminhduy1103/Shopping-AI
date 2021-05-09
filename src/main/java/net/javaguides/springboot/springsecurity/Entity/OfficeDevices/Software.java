package net.javaguides.springboot.springsecurity.Entity.OfficeDevices;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Software {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Sub_Office;

    private Long Quantities;

    private String Group_customer;

    private String System_support;

    private Long Quantities_account;

    private String CopyRight_limit;
    
    public Software() {
    }

    public Software(Long id, String sub_Office, Long quantities, String copyRight_limit, Long quantities_account, String system_support, String group_customer) {
        Id = id;
        Sub_Office = sub_Office;
        Quantities = quantities;
        CopyRight_limit = copyRight_limit;
        Quantities_account = quantities_account;
        System_support = system_support;
        Group_customer = group_customer;
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

public String getCopyRight_limit() {
    return this.CopyRight_limit;
}
public void setCopyRight_limit(String CopyRight_limit) {
    this.CopyRight_limit = CopyRight_limit;
}

public Long getQuantities_account() {
	return this.Quantities_account;
}
public void setQuantities_account(Long Quantities_account) {
	this.Quantities_account = Quantities_account;
}

public String getSystem_support() {
    return this.System_support;
}
public void setSystem_support(String System_support) {
    this.System_support = System_support;
}
public String getGroup_customer() {
    return this.Group_customer;
}
public void setGroup_customer(String Group_customer) {
    this.Group_customer = Group_customer;
}

}
