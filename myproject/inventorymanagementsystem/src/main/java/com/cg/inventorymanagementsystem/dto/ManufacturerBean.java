package com.cg.inventorymanagementsystem.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class ManufacturerBean {

		//declare and initialized variables 
		@Id
		@Column(name="order_id")	
		private Integer orderId;
		@Column(name="product_name")
	    private String productName;
		@Column(name="order_date")
	    private Date orderDate;
		@Column(name="units")
	    private Integer units;
		@Column(name="price_per_units")
	    private Double pricePerUnits;
		@Column(name="expected_date_of_delivery")
	    private Date expectedDateOfDelivery;
		@Column(name="supplier_id")
	    private Integer supplierId;
		
		public Integer getOrderId() {
			return orderId;
		}

        public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

        public String getProductName() {
			return productName;
		}

        public void setProductName(String productName) {
			this.productName = productName;
		}

        public Date getOrderDate() {
			return orderDate;
		}

        public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public Integer getUnits() {
			return units;
		}

        public void setUnits(Integer units) {
			this.units = units;
		}

        public Double getPricePerUnits() {
			return pricePerUnits;
		}
		
        public void setPricePerUnits(Double pricePerUnits) {
			this.pricePerUnits = pricePerUnits;
		}

        public Date getExpectedDateOfDelivery() {
			return expectedDateOfDelivery;
		}

        public void setExpectedDateOfDelivery(Date expectedDateOfDelivery) {
			this.expectedDateOfDelivery = expectedDateOfDelivery;
		}

		public Integer getSupplierId() {
			return supplierId;
		}

        public void setSupplierId(Integer supplierId) {
			this.supplierId = supplierId;
		}
		
		@Override
		public String toString() {
			return "ManufacturerBean [orderId=" + orderId + ", productName=" + productName + ", orderDate=" + orderDate
					+ ", units=" + units + ", pricePerUnits=" + pricePerUnits + ", expectedDateOfDelivery="
					+ expectedDateOfDelivery + ", supplierId=" + supplierId + "]";
		}

		
}
