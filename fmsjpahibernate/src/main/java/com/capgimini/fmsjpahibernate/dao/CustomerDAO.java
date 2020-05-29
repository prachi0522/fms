package com.capgimini.fmsjpahibernate.dao;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.CustomerBean;

//create one interface CustomerDAO
public interface CustomerDAO {
	//declare some methods 
	public List<CustomerBean> getAllCustomers() ;
	public boolean deleteCustomer(int customerid);
	public boolean addCustomer(CustomerBean bean);
	boolean modifyCustomer(CustomerBean bean );
	

}//end one interface
