package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private Long product_id;
	private String product_name;
	private Double product_cost;
	
	
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Double getProduct_cost() {
		return product_cost;
	}
	public void setProduct_cost(Double product_cost) {
		this.product_cost = product_cost;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_cost=" + product_cost
				+ "]";
	}
	public Product(Long product_id, String product_name, Double product_cost) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_cost = product_cost;
	}
	public Product() {
		super();
	}
	
	
	
	

}
