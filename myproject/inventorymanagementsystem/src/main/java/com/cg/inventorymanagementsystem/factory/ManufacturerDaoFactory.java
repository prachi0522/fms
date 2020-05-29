package com.cg.inventorymanagementsystem.factory;

import com.cg.inventorymanagementsystem.dao.ManufacturerDao;
import com.cg.inventorymanagementsystem.dao.ManufacturerDaoImpl;
import com.cg.inventorymanagementsystem.service.ManufacturerService;
import com.cg.inventorymanagementsystem.service.ManufacturerServiceImpl;

public class ManufacturerDaoFactory {
	public static ManufacturerDao getManufacturerDao() {
		return new ManufacturerDaoImpl(); 	
	}

	public static ManufacturerDao instanceOfManufacturerDaoImpl() {
		ManufacturerDao dao= new ManufacturerDaoImpl();
		return dao;
	   }

	public static ManufacturerService instanceOfManufacturerServiceImpl() {
		ManufacturerService service= new ManufacturerServiceImpl();
		return service;
	   }
}
