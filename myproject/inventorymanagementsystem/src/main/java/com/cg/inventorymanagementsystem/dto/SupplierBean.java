package com.cg.inventorymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class SupplierBean {
	@Id
	@Column(name = "supplier_id")
	private Integer supplierId;
	@Column(name = "supplier_name")
	private String supplierName;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_no")
	private Long phoneNo;

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "SupplierBean [supplierId=" + supplierId + ", supplierName=" + supplierName + ", address=" + address
				+ ", phoneNo=" + phoneNo + "]";
	}

}
