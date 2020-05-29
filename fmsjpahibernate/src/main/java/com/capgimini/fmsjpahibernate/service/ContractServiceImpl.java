package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dao.ContractDAO;
import com.capgimini.fmsjpahibernate.dto.ContractBean;
import com.capgimini.fmsjpahibernate.factory.ContractDAOManagerFactory;

public class ContractServiceImpl implements ContractService{

	ContractDAO dao= ContractDAOManagerFactory.instanceOfContactDAOImpl();

	public List<ContractBean> getAllContracts() {
		// TODO Auto-generated method stub
		return dao.getAllContracts();
	}

	public boolean deleteContract(long Contractid) {
		// TODO Auto-generated method stub
		return dao.deleteContract(Contractid);
	}

	public boolean addContract(ContractBean bean) {
		// TODO Auto-generated method stub
		return dao.addContract(bean);
	}

	public boolean modifyContract(long Contractid) {
		// TODO Auto-generated method stub
		return dao.modifyContract(Contractid);
	}

	}



