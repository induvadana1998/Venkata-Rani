package com.spring.myexam.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.myexam.entity.Book;

@Repository
public class BookDAO 
{
	SessionFactory sessionFactory;
	@Autowired
	public BookDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public void insertBook(Book b)
	{
		Session session=sessionFactory.openSession();
		session.save(b);
		session.beginTransaction().commit();
	}
	public void deleteBook(int bid)
	{
		Session session=sessionFactory.openSession();
		Book b=session.get(Book.class,bid);
		session.delete(b);
		session.beginTransaction().commit();
				
	}
	public void modifyBook(Book b)
	{
		Session session=sessionFactory.openSession();
		Book b1=session.get(Book.class,b.getBid());
		b1.setBtitle(b.getBtitle()); b1.setPrice(b.getPrice()); b1.setAuthor(b.getAuthor());
		session.beginTransaction().commit();
	}
	public Book getBook(int bid)
	{
		Session session=sessionFactory.openSession();
		return session.get(Book.class,bid);
	}
	

}


