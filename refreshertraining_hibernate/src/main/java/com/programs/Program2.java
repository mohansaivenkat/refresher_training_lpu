package com.programs;

import com.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// emf - table and connection
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresPU");

		// to access database operation methods
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		
		Product p1 = em.find(Product.class, 1); // optional
		
		System.out.println(p1);
		
		// custom query
		
		
		// to delete 
		
//		Product product  = em.find(Product.class, 1);
//		//Optional
//		et.begin();
//		em.remove(product);
//		et.commit();
		
		
		Product product2  = em.find(Product.class, 2);
		
		product2.setProduct_cost(95000d);
		et.begin();
		em.merge(product2);
		et.commit();
		
		
		
		

	}

}
