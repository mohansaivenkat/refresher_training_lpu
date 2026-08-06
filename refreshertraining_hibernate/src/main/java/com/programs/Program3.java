package com.programs;

import java.util.List;

import com.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Program3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresPU");

		// to access database operation methods
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		
		String sql = "select * from product where product_name='Iphone 17 Pro Max'";
		
		Query query = em.createNativeQuery(sql,Product.class);
		List<Product> list = query.getResultList();
		
		System.out.println(list);
		
		list.stream().forEach(i -> System.out.println(i.getProduct_name()));
	}

}
