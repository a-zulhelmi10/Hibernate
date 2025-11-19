package com.football;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class PsgRead {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Psg psg = new Psg();
		SelectionQuery<Psg> query = session.createSelectionQuery("from Psg", Psg.class);
		List<Psg> psglist = query.getResultList();
		for (Psg p : psglist) {
			System.out.println(p);
		}
		tx.commit();
		session.close();
	}
}