package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

public class EmployeeUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); //get session database
		Session session = sessionFactory.openSession(); //open the session
		Transaction tx = session.beginTransaction(); //start the db
		
		/*
		//Method 1
		Employee emp = session.get(Employee.class, 301); //select * from EmployeeRecords where empId=301
		emp.setSalary(5750); //update EmployeeRecords set Salary=5750 where empId=301 
		session.merge(emp);
		tx.commit();
		session.close();
		*/
		
		//Method2 --using HQL (Hibernate Query Language) -applied on Model (Class) not on table
		MutationQuery query = session.createMutationQuery("Update Employee set salary=:salary where empId=:empId");
		query.setParameter("salary", 5900);
		query.setParameter("empId", 301);
		query.executeUpdate();
		tx.commit();
		session.close();
		
	}

}
