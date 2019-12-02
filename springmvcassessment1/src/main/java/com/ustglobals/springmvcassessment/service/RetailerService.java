package com.ustglobals.springmvcassessment.service;

import com.ustglobals.springmvcassessment.dto.Product;
import com.ustglobals.springmvcassessment.dto.Retailer;

public interface RetailerService {

	public int register(Retailer bean);
	public Retailer login(int id, String password);
	public boolean updatePassword(int id, String password);
	public Product searchProduct(int id);


}
