package com.example.service;

import javax.persistence.EntityManager;

public class BookService {

	protected EntityManager em;
	
	public BookService(EntityManager entityManager){
		em = entityManager;
	}

}
