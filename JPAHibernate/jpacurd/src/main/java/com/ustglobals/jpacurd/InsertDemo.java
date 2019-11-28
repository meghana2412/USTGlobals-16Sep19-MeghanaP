package com.ustglobals.jpacurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobals.jpacurd.dto.Student;

public class InsertDemo {

	public static void main(String[] args)
	{
		Student student =new Student();
		student.setSid(1);
		student.setSname("Keerthi");
		student.setPercentage(95);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record saved");

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
