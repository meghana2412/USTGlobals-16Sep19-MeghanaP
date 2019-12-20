package com.ustglobals.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobals.stockmanagement.dto.Product;

@Repository
public class ProductDaoImpl implements ProductDAO{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product product) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Product searchProductByName(String name) {
		EntityManager manager = factory.createEntityManager();

		try {
			String query ="select Product where name=:name";
			TypedQuery<Product> typedQuery = manager.createQuery(query, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			return product;

		}catch(Exception e)
		{
			e.printStackTrace();
			return null;

		}

	}

	@Override
	public boolean addTocart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		try {
			String query ="select Product where category=:category";
			TypedQuery<Product> typedQuery = manager.createQuery(query, Product.class);
			typedQuery.setParameter("category", category);
			List<Product> products = typedQuery.getResultList();
			return products;

		}catch(Exception e)
		{
			e.printStackTrace();
			return null;

		}
	}

	@Override
	public Product searchProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();

		try {
			String query ="select Product where category=:category";
			TypedQuery<Product> typedQuery = manager.createQuery(query, Product.class);
			typedQuery.setParameter("category", category);
			Product product = typedQuery.getSingleResult();
			return product;

		}catch(Exception e)
		{
			e.printStackTrace();
			return null;

		}	
	}

	@Override
	public Product searchProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();

		try {
			String query ="select Product where company=:company";
			TypedQuery<Product> typedQuery = manager.createQuery(query, Product.class);
			typedQuery.setParameter("company", company);
			Product product = typedQuery.getSingleResult();
			return product;

		}catch(Exception e)
		{
			e.printStackTrace();
			return null;

		}
	}


	@Override
	public boolean modifyProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product products =manager.find(Product.class, product.getId());
			products.setId(product.getId());
			products.setName(product.getName());
			products.setCategory(product.getCategory());
			products.setCompany(product.getCompany());
			products.setQuantity(product.getQuantity());
			products.setPrice(product.getPrice());
			transaction.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}

}
