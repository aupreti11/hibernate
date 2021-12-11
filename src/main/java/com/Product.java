package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "p_table")
public class Product {
	
	int pid;
	String name;
	int price;
	
	public Product() {
		
	}
	
	public Product(String name, int price) {
		super();
		this.name= name;
		this.price = price;
	}
	
	@Id
	@GeneratedValue
	@Column(name="p_id")
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	@Column(name = "p_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "p_price")
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
