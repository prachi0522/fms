package com.capgimini.fmsjpahibernate.factory;

import com.capgimini.fmsjpahibernate.dao.ProductDAO;
import com.capgimini.fmsjpahibernate.dao.ProductDAOImpl;
import com.capgimini.fmsjpahibernate.service.ProductService;
import com.capgimini.fmsjpahibernate.service.ProductServiceImpl;

//create one class name ProductDAOManager
public class ProductDAOManagerFactory {
	public static ProductDAO getProductDAO() {//create one method of ProductDAO
		return new ProductDAOImpl(); 	//return ProductDAOImpl
	}

	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao= new ProductDAOImpl();
		return dao;
	   }

	public static ProductService instanceOfProductServiceImpl() {
		ProductService service=new ProductServiceImpl();
		return service;
	}
}//end of class



