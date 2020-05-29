package com.capgimini.fmsjpahibernate.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Product")

//create one class
public class ProductBean {
	//declare and initialized variables 
	@Id
	@Column(name="productid")	
	private  int productid;
	@Column(name="productname")
	private String productname;
	@Column(name="productdesc")
	private String productdsc;


	//Override toString method 
	@Override
	public String toString() {
		return " \n 1.Product Id=" + productid + "\n 2.Product Name=" + productname + "\n 3.Product Description=" + productdsc
				+ "\n";
	}
}//end of class
