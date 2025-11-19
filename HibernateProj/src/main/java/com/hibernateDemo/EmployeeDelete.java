package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

public class EmployeeDelete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); //get session database
		Session session = sessionFactory.openSession(); //open the session
		Transaction tx = session.beginTransaction(); //start the db
		
		/*
		//Method1
		Employee emp = new Employee();
		emp.setEmpId(444);
		session.remove(emp);
		tx.commit();
		session.close();
		*/
		/*
		//Method2
		Employee emp = session.get(Employee.class, 444);
		session.remove(emp);
		tx.commit();
		session.close();
		*/
		
		//Method3 --Delete multiple records
		SelectionQuery<Employee> query = session.createSelectionQuery("from Employee where salary >= :salary", Employee.class);
		query.setParameter("salary", 5000);
		List<Employee> empList = query.list();
		for (Employee emp : empList) {
			session.remove(emp);
		}
		tx.commit();
		session.close();
	
	}
}
