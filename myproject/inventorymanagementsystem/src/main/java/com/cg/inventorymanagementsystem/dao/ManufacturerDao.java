package com.cg.inventorymanagementsystem.dao;

import java.util.List;

import com.cg.inventorymanagementsystem.dto.ManufacturerBean;
import com.cg.inventorymanagementsystem.dto.SupplierBean;
import com.cg.inventorymanagementsystem.exception.IMSException;

public interface ManufacturerDao {
	
	public boolean addOrders(ManufacturerBean order) throws IMSException;

	public List<ManufacturerBean> getAllOrders() throws IMSException;

	public boolean updateOrders(int orderId) throws IMSException;
	
	public List<SupplierBean> showSupplierDetails()throws IMSException;
	
}
