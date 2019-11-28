package com.ustglobals.jpawithhibernetapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateRecord {

	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update Product set pname='Bathrobe' where pname = 'Towel'";
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println("rows updated successfully : "+result);
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
