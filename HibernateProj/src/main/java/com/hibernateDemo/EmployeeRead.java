package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

public class EmployeeRead {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); //get session database
		Session session = sessionFactory.openSession(); //open the session
		
		SelectionQuery<Employee> query = session.createSelectionQuery("from Employee",Employee.class);
		List<Employee> empList = query.list();
		System.out.println(empList);
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		session.close();
	}
}
