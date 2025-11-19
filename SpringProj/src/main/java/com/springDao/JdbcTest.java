package com.springDao;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {
	public static void main(String[] args) {
		//load spring bean confg file
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		//get the bean
		StudentDao dao = (StudentDao) context.getBean("student"); //since getBean() return object, we need to typecast
		//call the method
		/*insert
		dao.insertStudent(358, "Kang", 23);
		*/
		
		/*update 
		dao.updateStudent(101,24);
		*/
		
		/* delete
		dao.deleteStudent(101);
		*/
		
		List<Map<String,Object>> studList = dao.listStudents();
		for (Map stud : studList) {
			System.out.println(stud.get("id") +" " +stud.get("name") +" " +stud.get("age"));
		}
		
	}
}
