package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ContractBean;

public interface ContractService {
	public List<ContractBean> getAllContracts() ;
	public boolean deleteContract(long Contractid);
	public boolean addContract(ContractBean bean);
	boolean modifyContract(long Contractid );


}
