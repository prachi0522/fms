package com.cg.inventorymanagementsystem.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.cg.inventorymanagementsystem.dto.ManufacturerBean;
import com.cg.inventorymanagementsystem.dto.ProductBean;
import com.cg.inventorymanagementsystem.dto.SupplierBean;
import com.cg.inventorymanagementsystem.exception.IMSException;
import com.cg.inventorymanagementsystem.utility.JPAUtility;

public class ManufacturerDaoImpl implements ManufacturerDao {

	private Logger logger = Logger.getLogger(ManufacturerDaoImpl.class);
	Scanner sc = new Scanner(System.in);
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;
	
	public boolean addOrders(ManufacturerBean order) throws IMSException{

		try {
		    factory = Persistence.createEntityManagerFactory("Test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			try {
				transaction.begin();
				manager.persist(order);
				System.out.println("Record Inserted Successfully......");
				transaction.commit();
			} catch (Exception e) {
				System.out.println("order id already present in the list.......");
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;
	}


	public List<ManufacturerBean> getAllOrders() throws IMSException {

		logger.info("in get all products method");
		factory = JPAUtility.getEntityManagerFactory();
		logger.info("factory created");
		manager = factory.createEntityManager();
		logger.info("manager created");
		Query query = manager.createQuery(QueryConstants.GET_PRODUCTS);
		return query.getResultList();
	}

      public boolean updateOrders(int orderId) throws IMSException{

		try {
			factory = Persistence.createEntityManagerFactory("Test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			try {
				ManufacturerBean record = manager.find(ManufacturerBean.class, orderId);
				
				transaction.commit();
				System.out.println("order Details updated Successfully........");
			} catch (Exception e) {
				System.out.println("order id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;

	}
      
      public List<SupplierBean> showSupplierDetails() throws IMSException{
  		factory = Persistence.createEntityManagerFactory("Test");
  		EntityManager entityManager = factory.createEntityManager();
  		String jpql = "from ManufacturerBean";
  		Query query = entityManager.createQuery(QueryConstants.GET_PRODUCTS);

  		List<ManufacturerBean> record = query.getResultList();
  		System.out.println(record);
  		entityManager.close();

  		return null;
  	}


	

      
}

