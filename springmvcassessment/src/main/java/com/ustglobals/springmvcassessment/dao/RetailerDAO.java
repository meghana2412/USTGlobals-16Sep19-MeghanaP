package com.ustglobals.springmvcassessment.dao;

import com.ustglobals.springmvcassessment.dto.Order;
import com.ustglobals.springmvcassessment.dto.Product;
import com.ustglobals.springmvcassessment.dto.Retailer;

public interface RetailerDAO {

	public int register(Retailer bean);
	public Retailer login(int id, String password);
	public boolean updatePassword(int id, String password);
	public Product searchProduct(int id);
	public double totalAmountPayable(Product bean);
	public Order retrieveOrderById(int id);

}
