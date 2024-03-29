package com.ustglobals.jpawithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobals.jpawithhibernetapp.dto.Product;

public class DynamicInsertRecord {

	public static void main(String[] args)
	{
		EntityManager entityManager = null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "insert into Product values(pid=:pid,pname=:pname,quantity=:quant)";
			Query query = entityManager.createNativeQuery(jpql);
			query.setParameter("pid", 4);
			query.setParameter("pname", "CoffeeMug");
			query.setParameter("quant", 3);
			int result = query.executeUpdate();
			System.out.println("rows inserted successfully : "+result);

			entityTransaction.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}
	
	
}
