package com.springDao;

import java.util.List;
import java.util.Map;

public interface StudentDao { //StudentDao is an interface
	//insert this arguments into the table
	abstract public void insertStudent(int id, String name, int age);
	abstract public void updateStudent(int id, int age);
	abstract public void deleteStudent(int id);
	abstract public List<Map<String,Object>> listStudents(); //to return all records of the table 
}
