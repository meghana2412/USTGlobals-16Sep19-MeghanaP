package com.ustglobals.jpacurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobals.jpacurd.dto.Student;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction=null;
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Student student =entityManager.find(Student.class, 1);
			entityManager.remove(student);
			System.out.println("Record deleted");

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
