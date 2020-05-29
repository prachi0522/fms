package com.capgimini.fmsjpahibernate.factory;

import com.capgimini.fmsjpahibernate.dao.CustomerDAO;
import com.capgimini.fmsjpahibernate.dao.CustomerDAOImpl;
import com.capgimini.fmsjpahibernate.service.CustomerService;
import com.capgimini.fmsjpahibernate.service.CustomerServiceImpl;

//create one class
public class CustomerDAOManagerFactory {
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(); 	
	}

	public static CustomerDAO instanceOfCustomerDAOImpl() {
		CustomerDAO dao= new CustomerDAOImpl();
		return dao;
	   }

	public static CustomerService instanceOfCustomerServiceImpl() {
		CustomerService service= new CustomerServiceImpl();
		return service;
	}

	
}//end of class
