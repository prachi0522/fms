package com.cg.inventorymanagementsystem.service;

import java.util.List;

import com.cg.inventorymanagementsystem.dao.ManufacturerDao;
import com.cg.inventorymanagementsystem.dao.ManufacturerDaoImpl;
import com.cg.inventorymanagementsystem.dto.ManufacturerBean;
import com.cg.inventorymanagementsystem.dto.SupplierBean;
import com.cg.inventorymanagementsystem.exception.IMSException;

public class ManufacturerServiceImpl implements ManufacturerService{

	ManufacturerDao dao = new ManufacturerDaoImpl();

	@Override
	public boolean addOrders(ManufacturerBean order) throws IMSException {
		
		return dao.addOrders(order);
	}

	@Override
	public List<ManufacturerBean> getAllOrders() throws IMSException {
		
		return dao.getAllOrders();
	}

	@Override
	public boolean updateOrders(int orderId) throws IMSException {
		
		return dao.updateOrders(orderId);
	}

	@Override
	public List<SupplierBean> showSupplierDetails() throws IMSException {
		
		return dao.showSupplierDetails();
	}
		
				
		
	
}
