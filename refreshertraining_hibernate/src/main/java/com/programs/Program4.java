package com.programs;


import java.util.List;

import com.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresPU");

		// to access database operation methods
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		
		String jpql = "select p from Product p where p.product_id = 2";
		
		Query query = em.createQuery(jpql);
		
		List<Product> list = query.getResultList();
		
		System.out.println(list);
		
		

	}

}
