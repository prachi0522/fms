package com.capgimini.fmsjpahibernate.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgimini.fmsjpahibernate.dto.ContractBean;

class ContractDAOImplTest {

	private ContractBean contractBean = null;
	private ContractDAO dao = new ContractDAOImpl();
	
	@BeforeEach
	public void load() {
		contractBean = new ContractBean();

	}

	@Test
	void testGetAllContracts() {
		contractBean = new ContractBean();
		List<ContractBean> contract = dao.getAllContracts();
		assertNotNull(contract);

	}


}
