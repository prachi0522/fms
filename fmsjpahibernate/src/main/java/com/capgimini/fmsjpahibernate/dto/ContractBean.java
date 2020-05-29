package com.capgimini.fmsjpahibernate.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Contract")

//create one class
public class ContractBean {
	//declare and initialized variables 
	@Id
	@Column(name="contractid")	
	private  long contractid;
	@Column(name="Customerid")
    private int Customerid;
	@Column(name="Productid")
    private int Productid;
	@Column(name="Haulierid")
    private int Haulierid;
	@Column(name="DeliveryDate")
    private String DeleveryDate;
	@Column(name="DeleveryDay")
    private String DeleveryDay;
	@Column(name="Quantity")
    private int quantity;

	@Override
	public String toString() {
		return "\n 1.contractid=" + contractid + "\n 2.Customerid=" + Customerid + "\n 3.Productid=" + Productid
				+ "\n 4.Haulierid=" + Haulierid + "\n 5.DeleveryDate=" + DeleveryDate + "\n 6.DeleveryDay=" + DeleveryDay
				+ "\n 7.quantity=" + quantity + "\n";
	}
    
    
}//end of class
