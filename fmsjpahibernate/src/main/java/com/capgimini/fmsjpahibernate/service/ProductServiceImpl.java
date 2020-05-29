package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dao.ProductDAO;
import com.capgimini.fmsjpahibernate.dto.ProductBean;
import com.capgimini.fmsjpahibernate.factory.ProductDAOManagerFactory;

public class ProductServiceImpl implements ProductService{

	ProductDAO dao= ProductDAOManagerFactory.instanceOfProductDAOImpl();

	public List<ProductBean> getAllproducts() {
		// TODO Auto-generated method stub
		return dao.getAllproducts();
	}

	public boolean deleteproduct(int productid) {
		// TODO Auto-generated method stub
		return dao.deleteproduct(productid);
	}

	public boolean addproduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return dao.addproduct(bean);
	}

	public boolean modifyproduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return dao.modifyproduct(bean);
	}


}
