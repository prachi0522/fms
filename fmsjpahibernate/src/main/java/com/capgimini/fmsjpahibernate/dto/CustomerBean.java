package com.capgimini.fmsjpahibernate.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Customer")

//create one class
public class CustomerBean {
	//declare and initialized variables 
	@Id
	@Column(name="customerid")	
	private  int customerid;
	@Column(name="customername")
    private String customername;
	@Column(name="streetAddress1")
    private String streetAddress1;
	@Column(name="streetAddress2")
    private String streetAddress2;
	@Column(name="town")
    private String town;
	@Column(name="postalCode")
    private int postalCode;
	@Column(name="email")
    private String email;
	@Column(name="telephoneNo")
    private long telephoneNo;
    
	//Override toString method 
	@Override
	public String toString() {
		return "\n 1.Customer Id=" + customerid + "\n 2.Customer Name=" + customername + " \n 3.Street Address1="
				+ streetAddress1 + "\n 4.Street Address2=" + streetAddress2 + "\n 5.town=" + town + "\n 6.postalCode="
				+ postalCode + "\n 7.email=" + email + "\n 8.telephoneNo=" + telephoneNo + "\n";
	}//end of toString
	
    
}//end of class
