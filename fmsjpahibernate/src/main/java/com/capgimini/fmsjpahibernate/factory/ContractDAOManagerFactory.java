package com.capgimini.fmsjpahibernate.factory;

import com.capgimini.fmsjpahibernate.dao.ContractDAO;
import com.capgimini.fmsjpahibernate.dao.ContractDAOImpl;
import com.capgimini.fmsjpahibernate.service.ContractService;
import com.capgimini.fmsjpahibernate.service.ContractServiceImpl;

//Create one class
public class ContractDAOManagerFactory {
	public static ContractDAO getContractDAO() {
		return new ContractDAOImpl(); 	//return ContractDAOImpl()
	}

	public static ContractDAO instanceOfContactDAOImpl() {
		ContractDAO dao= new ContractDAOImpl();
		return dao;
	   }

	public static ContractService instanceOfContactServiceImpl() {
		ContractService service= new ContractServiceImpl();
		return service;
	   }
	
}//end of class
