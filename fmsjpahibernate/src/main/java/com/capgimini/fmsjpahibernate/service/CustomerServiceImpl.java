package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dao.CustomerDAO;
import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.factory.CustomerDAOManagerFactory;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAO dao=CustomerDAOManagerFactory.instanceOfCustomerDAOImpl();

	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	

	public boolean addCustomer(CustomerBean bean) {
		// TODO Auto-generated method stub
		return dao.addCustomer(bean);
	}

	

	public boolean modifyCustomer(CustomerBean bean2) {
		// TODO Auto-generated method stub
		return dao.modifyCustomer(bean2);
	}

	public boolean deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customerid);
	}

	
}
