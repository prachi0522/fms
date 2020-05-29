package com.capgimini.fmsjpahibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.fmsjpahibernate.dto.ContractBean;
import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.dto.ProductBean;
import com.capgimini.fmsjpahibernate.validation.ForesteryValidation;

//create one class ContractDAOImpl which implements all unimplemented methods of ContractDAO
public class ContractDAOImpl implements ContractDAO {

	Scanner sc = new Scanner(System.in);
	ContractBean bean1 = new ContractBean();
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public List<ContractBean> getAllContracts() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ContractBean";
		Query query = entityManager.createQuery(jpql);

		List<ContractBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}


	public boolean deleteContract(long Contractid) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			try {

				ContractBean record = entityManager.find(ContractBean.class, Contractid);
				entityManager.remove(record);
				transaction.commit();
				System.out.println("Contract Details are deleted........");
			} catch (Exception e) {
				System.out.println("Contract id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return true;


	}

	public boolean addContract(ContractBean bean) {

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			try {
				transaction.begin();
				entityManager.persist(bean);
				System.out.println("Record Inserted Successfully......");
				transaction.commit();
			} catch (Exception e) {
				System.out.println("Contract id already present in the list.......");
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;
	}


	public boolean modifyContract(long Contractid) {

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			try {
				ContractBean record = entityManager.find(ContractBean.class, Contractid);
				//      bean1.setProductid(Productid);
				transaction.commit();
				System.out.println("Contract Details updated Successfully........");
			} catch (Exception e) {
				System.out.println("Contract id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;

	}


}// end of class