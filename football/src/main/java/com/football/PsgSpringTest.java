package com.football;

import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PsgSpringTest {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("psgSpringbean.xml");
	PsgSpringBeanClass psg = (PsgSpringBeanClass)context.getBean("psg");
	System.out.println(psg);
}
}