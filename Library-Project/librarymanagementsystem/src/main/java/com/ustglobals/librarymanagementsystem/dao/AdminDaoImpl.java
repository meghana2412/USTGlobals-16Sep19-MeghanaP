package com.ustglobals.librarymanagementsystem.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
//import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobals.librarymanagementsystem.dto.UserBean;

@Repository
public class AdminDaoImpl implements AdminDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;


	@Override
	public boolean updateStudent(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserBean userBean =  manager.find(UserBean.class, bean.getUserID());
		userBean.setUserType("Student");
		userBean.setUserName(bean.getUserName());
		userBean.setUserEmail(bean.getUserEmail());
		userBean.setUserPassword(bean.getUserPassword());
		userBean.setUserID(bean.getUserID());
		userBean.setUserPhno(bean.getUserPhno());
		transaction.commit();
		return true;
	}


	@Override
	public boolean updateLibrarian(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserBean userBean =  manager.find(UserBean.class, bean.getUserID());
		userBean.setUserType("Librarian");
		userBean.setUserName(bean.getUserName());
		userBean.setUserEmail(bean.getUserEmail());
		userBean.setUserPassword(bean.getUserPassword());
		userBean.setUserID(bean.getUserID());
		userBean.setUserPhno(bean.getUserPhno());		
		transaction.commit();
		return true;
		}


	@Override
	public boolean deleteUser(int userID) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserBean bean = manager.find(UserBean.class, userID);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		else {
			return false;
		}	
	}


	


	@Override
	public List<UserBean> showAllUsers() {
		String jpql ="from UserBean";
		EntityManager manager =factory.createEntityManager();
		TypedQuery<UserBean> query=manager.createQuery(jpql,UserBean.class);
		List<UserBean> UserBean = query.getResultList();
		return UserBean;	}


	@Override
	public UserBean searchUser(int userID) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(UserBean.class, userID);	
	}

}
