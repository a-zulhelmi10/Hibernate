//Run this file
package com.hibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeInsert {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();// get the session factory first to connect
																			// with database
		Session session = sessionFactory.openSession(); // for database transaction (insert,update,delete)
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();// now we want to insert the record into the table
		emp.setEmpId(1000);
		emp.setEmpName("Lucas");
		emp.setSalary(4600);

		System.out.println(emp);
		session.persist(emp); // insert into EmployeeRecords values(...,...,...)
		tx.commit();
		session.close();
	}
}
