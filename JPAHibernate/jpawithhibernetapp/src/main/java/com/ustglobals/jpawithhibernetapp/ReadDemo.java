package com.ustglobals.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobals.jpawithhibernetapp.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class ,1);
		System.out.println(productDetail.getClass());

		System.out.println("ID---"+productDetail.getPid());
		System.out.println("name--"+productDetail.getPname());		
		System.out.println("quantity---"+productDetail.getQuantity());		
				
	}
}
