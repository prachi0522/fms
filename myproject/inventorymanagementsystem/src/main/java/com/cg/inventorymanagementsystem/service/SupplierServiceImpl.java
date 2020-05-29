package com.cg.inventorymanagementsystem.service;

import java.util.List;

import com.cg.inventorymanagementsystem.dao.SupplierDao;
import com.cg.inventorymanagementsystem.dao.SupplierDaoImpl;
import com.cg.inventorymanagementsystem.dto.ManufacturerBean;
import com.cg.inventorymanagementsystem.dto.ProductBean;
import com.cg.inventorymanagementsystem.exception.IMSException;

public class SupplierServiceImpl implements SupplierService{
	
	SupplierDao dao=new SupplierDaoImpl();

	@Override
	public List<ManufacturerBean> viewMyOrders() throws IMSException {
		
		return dao.viewMyOrders();
	}

	@Override
	public List<ProductBean> showProducts() throws IMSException {
		
		return dao.showProducts();
	}

}
