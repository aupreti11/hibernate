package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="c_table")
public class Category {
	
	int cid;
	String name;
	List<Product> productlist;
	
	public Category() {
		
	}
	public Category(String name,List<Product> productlist ) {
		this.name = name;
		this.productlist = productlist;
	}
	@Id
	@GeneratedValue
	@Column(name="c_id")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Column(name = "c_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	public List<Product> getProductlist() {
		return productlist;
	}

	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
	
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", name=" + name + ", productlist=" + productlist + "]";
	}
	

}
