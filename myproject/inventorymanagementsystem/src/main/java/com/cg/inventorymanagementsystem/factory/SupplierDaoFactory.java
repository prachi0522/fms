package com.cg.inventorymanagementsystem.factory;

import com.cg.inventorymanagementsystem.dao.SupplierDao;
import com.cg.inventorymanagementsystem.dao.SupplierDaoImpl;
import com.cg.inventorymanagementsystem.service.SupplierService;
import com.cg.inventorymanagementsystem.service.SupplierServiceImpl;

public class SupplierDaoFactory {
	public static SupplierDao getSupplierDao() {
		return new SupplierDaoImpl(); 	
	}

	public static SupplierDao instanceofSupplierDaoImpl() {
		SupplierDao dao= new SupplierDaoImpl();
		return dao;
	   }

	public static SupplierService instanceOfSupplierServiceImpl() {
		SupplierService service= new SupplierServiceImpl();
		return service;
	}

}
