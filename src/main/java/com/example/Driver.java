package com.example;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.domain.Book;


public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BookPersistenceUnit");
		EntityManager em = factory.createEntityManager();
		
		Book book = new Book(1);
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		
		Book book2 = em.find(Book.class, 1);
		System.out.println(book2.getId());
	}

}
