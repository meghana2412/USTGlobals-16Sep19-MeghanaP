package com.ustglobals.springmvcassessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobals.springmvcassessment.dao.RetailerDAO;
import com.ustglobals.springmvcassessment.dto.Product;
import com.ustglobals.springmvcassessment.dto.Retailer;

@Service
public class RetailreServiceImpl implements RetailerService{

	@Autowired
	private RetailerDAO dao;
	
	@Override
	public int register(Retailer bean) {
		return dao.register(bean);
	}

	@Override
	public Retailer login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}

	@Override
	public Product searchProduct(int id) {
		return dao.searchProduct(id);
	}

}
