package com.cg.inventorymanagementsystem.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {

	
	private static EntityManagerFactory factory = null;

	static {

		factory = Persistence.createEntityManagerFactory("product_pu");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return factory;
	}
}
