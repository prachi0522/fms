package com.capgimini.fmsjpahibernate.service;
import java.util.List;

import com.capgimini.fmsjpahibernate.dto.CustomerBean;

//create one interface CustomerDAO
public interface CustomerService {
	//declare some methods 
	public List<CustomerBean> getAllCustomers() ;
	public boolean deleteCustomer(int customerid);
	public boolean addCustomer(CustomerBean bean);
	
	public boolean modifyCustomer(CustomerBean bean2);


}//end one interface
