package com.ustglobals.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobals.librarymanagementsystem.dto.UserBean;

@Repository
public class UserDaoImpl implements UserDAO{
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public UserBean userLogin(int userID, String userPassword) {

		String jpql ="from UserBean where userID=:userID and userPassword=:userPassword";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("userID", userID);
		query.setParameter("userPassword", userPassword);

		try {
			UserBean bean = (UserBean)query.getSingleResult();
			return bean;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;

		}	
	}
	
	@Override
	public boolean regesterUser(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			//bean.setUserType("Admin");
			manager.persist(bean);
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
