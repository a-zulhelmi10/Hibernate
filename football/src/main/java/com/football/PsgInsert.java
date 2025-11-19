//Run this file
package com.football;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PsgInsert {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();//get the session factory first to connect with database
		Session session = sessionFactory.openSession(); //for database transaction (insert,update,delete)
		Transaction tx = session.beginTransaction();
		
		Psg psg = new Psg();
		psg.setId(377);
		psg.setPlayer("Dembele");
		psg.setPosition("RW");
		psg.setSalary(11200);
		psg.setCountry("France");
		session.persist(psg); //insert into EmployeeRecords values(...,...,...)
		tx.commit();
		session.close();
	}
}
