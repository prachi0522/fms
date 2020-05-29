package com.capgimini.fmsjpahibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.fmsjpahibernate.dto.CustomerBean;
import com.capgimini.fmsjpahibernate.validation.ForesteryValidation;

//create one class CustomerDAOImpl which implements all unimplemented methods of CustomerDAO
public class CustomerDAOImpl implements CustomerDAO {

	Scanner sc = new Scanner(System.in);
	CustomerBean bean1 = new CustomerBean();
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public List<CustomerBean> getAllCustomers() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from CustomerBean";
		Query query = entityManager.createQuery(jpql);

		List<CustomerBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}

	public boolean deleteCustomer(int customerid) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			try {
				CustomerBean record = entityManager.find(CustomerBean.class, customerid);
				entityManager.remove(record);
				transaction.commit();
				System.out.println("Customer Details are deleted........");
			} catch (Exception e) {
				System.out.println("Customer id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return true;

	}

	public boolean addCustomer(CustomerBean bean) {

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
				System.out.println("Customer id already present in the list.......");
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;
	}

	public boolean modifyCustomer(CustomerBean bean) {
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			try {
				System.out.println("Enter Customer Id for Update.........");
				String ch7=null;
				char c7 = 'y';
				while(c7=='y') {
					ch7= sc.next();
					if(ForesteryValidation.isNumber(ch7)) {
						c7='n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer customerid= Integer.parseInt(ch7);
             CustomerBean record = entityManager.find(CustomerBean.class, customerid);
             System.out.println("Enter Telephone Number to update.......");
				String phone1=null;
				char c5 = 'y';
				while (c5=='y') {
					phone1= sc.next();
					if (ForesteryValidation.phoneValidation(phone1)) {
						c5='n';
					} else {
						System.err.println("enter valid phone number");
					}
				}
				Long telephoneno1= Long.parseLong(phone1);
			
				record.setTelephoneNo(telephoneno1);
				transaction.commit();
				System.out.println("Customer Details updated Successfully........");
			} catch (Exception e) {
				System.out.println("Customer id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;

	}

}// end of class