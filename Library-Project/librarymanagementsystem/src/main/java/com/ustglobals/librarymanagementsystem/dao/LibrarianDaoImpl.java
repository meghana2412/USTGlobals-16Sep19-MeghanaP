package com.ustglobals.librarymanagementsystem.dao;

import java.time.LocalDate;
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
import com.ustglobals.librarymanagementsystem.dto.IssueBookDetailsBean;
@Repository
public class LibrarianDaoImpl implements LibrarianDAO{

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addBooks(BookBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
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

	@Override
	public boolean updateBooks(BookBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookBean bookBean =  manager.find(BookBean.class, bean.getbookId());
		bookBean.setbookId(bean.getbookId());
		bookBean.setbookTitle(bean.getbookTitle());
		bookBean.setAuthor(bean.getAuthor());
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteBooks(int bookId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookBean bean = manager.find(BookBean.class, bookId);
		if(bean!=null) {
			transaction.commit();
			return true;
		}
		else {
			return false;
		}	
	}


	@Override
	public List<IssueBookDetailsBean> showAllIssuedBooks() {
		EntityManager manager = factory.createEntityManager();
		String showIssuedBooks ="from IssueBookDetailsBean";
		Query query = manager.createQuery(showIssuedBooks);
		try {
			List<IssueBookDetailsBean> issuedBooks = query.getResultList();
			return issuedBooks;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public List<BookBean> searchBook() {
		String jpql ="from BookBean";
		EntityManager manager =factory.createEntityManager();
		TypedQuery<BookBean> query=manager.createQuery(jpql,BookBean.class);
		List<BookBean> BookBean = query.getResultList();
		return BookBean;	
	}

	@Override
	public List<BookRegestrationBean> showAllRequests() {
		EntityManager manager = factory.createEntityManager();
		String showRegestrationDetails ="from BookRegestrationBean";
		Query query = manager.createQuery(showRegestrationDetails);
		try {
			List<BookRegestrationBean> requestDetails = query.getResultList();
			return requestDetails;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean acceptRequest(int regestrationId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookRegestrationBean regesterBean = manager.find(BookRegestrationBean.class, regestrationId);
		if(regesterBean!=null) {
			manager.contains(regesterBean);
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean issueBook(int regestrationId, int bookId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		LocalDate todaysDate = LocalDate.now();
		LocalDate returnDate = LocalDate.of(todaysDate.getYear(), todaysDate.getMonth(), todaysDate.getDayOfMonth() + 7);

		transaction.begin();

		try {
			BookBean bookBean = manager.find(BookBean.class, bookId);
			BookRegestrationBean regesterBean = manager.find(BookRegestrationBean.class, regestrationId);

			IssueBookDetailsBean issueDetails = new IssueBookDetailsBean();
			issueDetails.setRegesterBean(regesterBean);
			issueDetails.setBookBean(bookBean);
			issueDetails.setIssueDate(todaysDate);
			issueDetails.setReturnDate(returnDate);
			manager.persist(issueDetails);
			transaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;	


	}

	

}
