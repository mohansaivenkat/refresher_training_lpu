package com.programs;

import com.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Program1 {
	
	public static void main(String[] args) {
		
		//emf - table and connection
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresPU");
		
		//to access database operation methods
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Product p1 = new Product();
		
//		p1.setProduct_id(1l);
//		p1.setProduct_name("Samsung S23 Ultra");
//		p1.setProduct_cost(65000d);
		
		p1.setProduct_id(2l);
		p1.setProduct_name("Iphone 17 Pro Max");
		p1.setProduct_cost(125000d);
		
		et.begin();
		em.persist(p1);
		et.commit();
		
		
	}

}