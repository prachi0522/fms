package com.cg.inventorymanagementsystem.service;

import java.util.List;

import com.cg.inventorymanagementsystem.dto.ManufacturerBean;
import com.cg.inventorymanagementsystem.dto.ProductBean;
import com.cg.inventorymanagementsystem.exception.IMSException;

public interface SupplierService {

    public List<ManufacturerBean> viewMyOrders() throws IMSException;
	
	public List<ProductBean> showProducts() throws IMSException;
}
