package com.ustglobals.stockmanagement.dao;

import java.util.List;

import com.ustglobals.stockmanagement.dto.Product;



public interface ProductDAO {

	public boolean addProduct(Product product);
	public Product searchProductByName(String name);
	public Product searchProductByCategory(String category);
	public Product searchProductByCompany(String company);
	public boolean modifyProduct(Product product);
	public List<Product> getAllProductByCategory(String category);
	public boolean addTocart();
	
}
