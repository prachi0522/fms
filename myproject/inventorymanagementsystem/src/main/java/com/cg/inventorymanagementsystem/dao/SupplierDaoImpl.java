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
import com.cg.inventorymanagementsystem.utility.JPAUtility;

public class SupplierDaoImpl implements SupplierDao{

	
	private Logger logger = Logger.getLogger(ManufacturerDaoImpl.class);
	Scanner sc = new Scanner(System.in);
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;
	
	@Override
	public List<ManufacturerBean> viewMyOrders() {
		logger.info("in get all orders method");
		factory = JPAUtility.getEntityManagerFactory();
		logger.info("factory created");
		manager = factory.createEntityManager();
		logger.info("manager created");
		Query query = manager.createQuery(QueryConstants.GET_ORDERS);
		return query.getResultList();
		
	}

	@Override
	public List<ProductBean> showProducts() {
		logger.info("in get all products method");
		factory = JPAUtility.getEntityManagerFactory();
		logger.info("factory created");
		manager = factory.createEntityManager();
		logger.info("manager created");
		Query query = manager.createQuery(QueryConstants.GET_PRODUCTS);
		return query.getResultList();		
	}

}
