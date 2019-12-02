package com.ustglobals.springmvcassessment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobals.springmvcassessment.dto.Order;
import com.ustglobals.springmvcassessment.dto.Product;
import com.ustglobals.springmvcassessment.dto.Retailer;

@Repository
public class RetailerDAOImpl implements RetailerDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public int register(Retailer bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;	}

	@Override
	public Retailer login(int id, String password) {
		String jpql ="from Retailer where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("id", id);
		query.setParameter("password", password);
		
		try {
		Retailer bean = (Retailer)query.getSingleResult();
		return bean;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;

		}	}

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer bean = manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public Product searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		return manager.find(Product.class, id);

	}

	@Override
	public double totalAmountPayable(Product bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Product pbean = manager.find(Product.class,bean.getPid());
		double productprice=pbean.getPriceperunit();
		int quant =pbean.getQuantity();
		return productprice*quant;
	}

	@Override
	public Order retrieveOrderById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		return manager.find(Order.class, id);	
		}

}
