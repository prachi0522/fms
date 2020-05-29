package com.capgimini.fmsjpahibernate.service;

import java.util.List;

import com.capgimini.fmsjpahibernate.dto.ProductBean;

public interface ProductService {
	public List<ProductBean> getAllproducts() ;
	public boolean deleteproduct(int productid);
	public boolean addproduct(ProductBean bean);
	boolean modifyproduct(ProductBean bean );

}//end of interface
