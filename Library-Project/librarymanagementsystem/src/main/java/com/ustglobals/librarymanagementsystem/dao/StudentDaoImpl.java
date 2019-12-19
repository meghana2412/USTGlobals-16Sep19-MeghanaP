package com.ustglobals.librarymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;

@Repository
public class StudentDaoImpl implements StudentDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public BookBean searchBook(String bookTitle) {
		String jpql ="from BookBean where bookTitle=:bookTitle";

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createQuery(jpql);
		query.setParameter("bookTitle", bookTitle);
		 
		return (BookBean) query.getSingleResult();
	}



	@Override
	public List<BookBean> getAllBooks() {
		String jpql ="from BookBean";
		EntityManager manager =factory.createEntityManager();
		TypedQuery<BookBean> query=manager.createQuery(jpql,BookBean.class);
		List<BookBean> BookBean = query.getResultList();
		return BookBean;
	}



	@Override
	public boolean cancelRequest(int regestrationId, int userID) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String select="from BookRegestrationBean where regestrationId=:regestrationId and userID=:userID";
		Query query=manager.createQuery(select);

		query.setParameter("regestrationId", regestrationId);
		query.setParameter("userID", userID);
		BookRegestrationBean book=null;
		try {
			book=(BookRegestrationBean)query.getSingleResult();
			manager.remove(book);
			transaction.commit();

		}catch(Exception e) {
			transaction.rollback();

			return false;
		}
		manager.close();
		return true;	
	}



	@Override
	public boolean requestBook(BookRegestrationBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch( Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	
}



