package com.ustglobals.jpawithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteRecord {

	public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "delete from Product where pid=3";
			Query query = entityManager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println("rows eleted successfully : "+result);
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
