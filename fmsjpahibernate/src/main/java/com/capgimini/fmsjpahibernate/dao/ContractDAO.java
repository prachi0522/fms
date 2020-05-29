package com.capgimini.fmsjpahibernate.dao;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ContractBean;

public interface ContractDAO {
	public List<ContractBean> getAllContracts() ;
	public boolean deleteContract(long Contractid);
	public boolean addContract(ContractBean bean);
	boolean modifyContract(long Contractid );


}
