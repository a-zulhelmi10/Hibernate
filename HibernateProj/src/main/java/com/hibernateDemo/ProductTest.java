package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();//get the session factory first to connect with database
		Session session = sessionFactory.openSession(); //for database transaction (insert,update,delete)
		Transaction tx = session.beginTransaction();
		
		Product prod = new Product();
		// prod.setProductId(111); //once this has become primary key after using @GenerateValue, no need to write this line anymore
		prod.setProductName("Keyboard");
		prod.setPrice(50);
		session.persist(prod);
		tx.commit();
		session.close();

	}

}
