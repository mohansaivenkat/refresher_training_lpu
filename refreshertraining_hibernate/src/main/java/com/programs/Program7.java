package com.programs;

import java.util.ArrayList;
import java.util.List;

import com.entity.Bank;
import com.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Program7 {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgresPU");

		// to access database operation methods
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		
		Customer cust1 = new Customer( "436726", "Mohan", "mohansaivenkat2004@gmail.com", 56000d);
		Customer cust2  = new Customer("436727", "Rohit",   "rohit.sharma@example.com",   62000d);
		Customer cust3  = new Customer("436728", "Rahul",   "rahul.verma@example.com",    48000d);
		Customer cust4  = new Customer("436729", "Abhinav", "abhinav.kumar@example.com",  75000d);
		Customer cust5  = new Customer("436730", "Murari",  "murari.rao@example.com",     51000d);
		Customer cust6  = new Customer("436731", "Vishal",  "vishal.singh@example.com",   68000d);
		Customer cust7  = new Customer("436732", "Jeevan",  "jeevan.reddy@example.com",   54000d);
		Customer cust8  = new Customer("436733", "Sandeep", "sandeep.nair@example.com",   81000d);
		Customer cust9  = new Customer("436734", "Anil",    "anil.mehta@example.com",     45000d);
		Customer cust10 = new Customer("436735", "Priya",   "priya.sharma@example.com",   59000d);
		Customer cust11 = new Customer("436736", "Ananya",  "ananya.das@example.com",     72000d);
		
		List<Customer> list =  new ArrayList<>();
		
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		list.add(cust5);
		list.add(cust6);
		list.add(cust7);
		list.add(cust8);
		list.add(cust9);
		list.add(cust10);
		list.add(cust11);	
		
		
		Bank bank1 = new Bank("APGB",64783778l,list);
		
		et.begin();
		
		em.persist(bank1);
		
		
		et.commit();
		
		
		
	}

}
