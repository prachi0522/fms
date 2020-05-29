package com.cg.inventorymanagementsystem.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class ProductBean {

	@Id
	@Column(name="product_id")
	private Integer productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_cost")
	private Double productCost;
	@Column(name="units")
	private Integer unit;
	@Column(name="manufacturing_date")
	private Date manufacturingDate;
	@Column(name="expiry_date")
	private Date expiryDate;
	
	public Integer getProductId() {
		return productId;
	}

    public void setProductId(Integer productId) {
		this.productId = productId;
	}

    public String getProductName() {
		return productName;
	}

    public void setProductName(String productName) {
		this.productName = productName;
	}

    public Double getProductCost() {
		return productCost;
	}

    public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

    public Integer getUnit() {
		return unit;
	}

    public void setUnit(Integer unit) {
		this.unit = unit;
	}

    public Date getManufacturingDate() {
		return manufacturingDate;
	}

    public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

    public Date getExpiryDate() {
		return expiryDate;
	}

    public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

    @Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", unit=" + unit + ", manufacturingDate=" + manufacturingDate + ", expiryDate=" + expiryDate + "]";
	}
	
	
}
