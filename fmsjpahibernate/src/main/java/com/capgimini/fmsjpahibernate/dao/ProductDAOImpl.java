package com.capgimini.fmsjpahibernate.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgimini.fmsjpahibernate.dto.ProductBean;
import com.capgimini.fmsjpahibernate.validation.ForesteryValidation;

//create one class ProductDAOImpl which implements all unimplemented methods of ProductDAO
public class ProductDAOImpl implements ProductDAO {

	Scanner sc = new Scanner(System.in);
	ProductBean bean1 = new ProductBean();
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	public List<ProductBean> getAllproducts() {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductBean";
		Query query = entityManager.createQuery(jpql);

		List<ProductBean> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}


	public boolean deleteproduct(int productid) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			try {
				ProductBean record = entityManager.find(ProductBean.class, productid);
				entityManager.remove(record);
				transaction.commit();
				System.out.println("Product Details are deleted........");
			} catch (Exception e) {
				System.out.println("Product id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return true;

	}

	public boolean addproduct(ProductBean bean) {

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
				System.out.println("Product id already present in the list.......");
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;
	}


	public boolean modifyproduct(ProductBean bean) {
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			try {
				System.out.println("Enter Product Id for Update.........");
				String id4=null;
				char c4='y';
				while(c4=='y') {
					id4= sc.next();
					if(ForesteryValidation.isNumber(id4)) {
						c4='n';
					} else {
						System.err.println("enter only numbers");
					}
				}			
				int Productid = Integer.parseInt(id4);
				ProductBean record = entityManager.find(ProductBean.class, Productid);
				System.out.println("Enter Product Name to update.......");
				String pname = sc.next();
				record.setProductname(pname);
				transaction.commit();
				System.out.println("Product Details updated Successfully........");
			} catch (Exception e) {
				System.out.println("Product id is not present in the list");
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return true;

	}




}// end of class