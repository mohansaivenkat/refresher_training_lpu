package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Long ifsc;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Customer> customer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIfsc() {
		return ifsc;
	}

	public void setIfsc(Long ifsc) {
		this.ifsc = ifsc;
	}

	

	public Bank() {
		super();
	}

	

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", ifsc=" + ifsc + ", customer=" + customer + "]";
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public Bank(String name, Long ifsc, List<Customer> customer) {
		super();
		this.name = name;
		this.ifsc = ifsc;
		this.customer = customer;
	}

	
	
	

}
