package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();		
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		
		// insert statement
		Product p1 = new Product("Macbook Pro", 2300);
		Product p2 = new Product("macbook air", 1300);
		List<Product> listofproduct = new ArrayList<Product>();
		listofproduct.add(p1);
		listofproduct.add(p2);
		
		Product p3 = new Product("samsung" ,800);
		Product p4 = new Product("blackberry" , 500);
		Product p5 = new Product("motorola" , 900);
		List<Product> listofproduct1 = new ArrayList<Product>();
		listofproduct1.add(p3);
		listofproduct1.add(p4);
		listofproduct1.add(p5);
		
		Category c1 = new Category("Laptops",listofproduct);
		Category c2 = new Category("Mobile Phones",listofproduct1);
		
		session.save(c1);
		session.save(c2);  
		
//		// update statement
//		Product product =session.get(Product.class, 15);
//		product.setName("Toshiba");
//		session.update(product);  
//		
//		Category category = session.get(Category.class, 13);
//		category.setName("PCS");
//		session.update(category);   
//		
//		//delete statement
//		Product product1 =session.get(Product.class, 15);
//		session.delete(product1);   
//		
//		Category category1 = session.get(Category.class, 13);
//		session.delete(category1);   
//		
//		//select statement
//		String str = "from Product";
//		Query query = session.createQuery(str);
//		List<Product> alltheproduct = query.getResultList();
//		for(Product p :alltheproduct) {
//			System.out.println(p);
//		}
//		
//		String string = "from Category";
//		Query query1 = session.createQuery(string);
//		List<Category> allthecategory = query1.getResultList();
//		for(Category c: allthecategory) {
//			System.out.println(c);
//		}
	
		session.getTransaction().commit();
		session.close();
	}

}
