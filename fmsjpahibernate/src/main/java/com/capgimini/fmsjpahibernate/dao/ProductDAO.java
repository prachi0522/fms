package com.capgimini.fmsjpahibernate.dao;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ProductBean;

//create one interface
public interface ProductDAO {
	public List<ProductBean> getAllproducts() ;
	public boolean deleteproduct(int productid);
	public boolean addproduct(ProductBean bean);
	boolean modifyproduct(ProductBean bean );
	}//end of interface

