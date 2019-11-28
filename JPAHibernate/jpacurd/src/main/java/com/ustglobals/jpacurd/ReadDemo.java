package com.ustglobals.jpacurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobals.jpacurd.dto.Student;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		Student StudentDetail = entityManager.find(Student.class ,1);
		System.out.println("ID---"+StudentDetail.getSid());
		System.out.println("name--"+StudentDetail.getSname());		
		System.out.println("Percentage---"+StudentDetail.getPercentage());		
	}
}
