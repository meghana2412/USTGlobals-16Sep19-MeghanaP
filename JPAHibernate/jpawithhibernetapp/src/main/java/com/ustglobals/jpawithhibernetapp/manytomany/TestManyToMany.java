package com.ustglobals.jpawithhibernetapp.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course c = new Course();
		c.setCid(9);
		c.setCname("physics");
		
		Course c1 = new Course();
		c1.setCid(10);
		c1.setCname("chemistry");

		Course c2 = new Course();
		c2.setCid(11);
		c2.setCname("Biology");
		
		ArrayList<Course> al= new ArrayList<Course>();
		al.add(c);
		al.add(c1);
		al.add(c2);

		
		Student s1 = new Student();
		s1.setSid(24);
		s1.setSname("sachin");
		s1.setCourse(al);
		
		Student s2 = new Student();
		s2.setSid(68);
		s2.setSname("punith");
		s2.setCourse(al);
		
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s1);
			entityManager.persist(s2);
			System.out.println("3rd table created Successfully");
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
