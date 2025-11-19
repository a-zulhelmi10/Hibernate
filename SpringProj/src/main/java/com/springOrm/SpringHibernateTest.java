package com.springOrm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {
	public static void main(String[] args) {
	//load spring conf xml file
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-Hibernate.xml");
	ProductDao dao = (ProductDao) context.getBean("product");
	/* or instead of typecasting you can do like this
	ProductDao dao = context.getBean("product",ProductDao.class);
	*/
	/* Insert records 
	Product prod = new Product();
	
	prod.setProductId(576);
	prod.setProductName("Charger");
	prod.setProductPrice(30.00);
	dao.insertProduct(prod);
	*/
	
	/* update records 
	Product prod = dao.getProductById(211);
	System.out.println(prod);
	prod.setProductName("Mouse New");
	dao.updateProduct(prod);
	*/
	
	/* delete records by id 
	dao.deleteProductById(211);
	*/
	
	/* delete records by object 
	Product prod = dao.getProductById(305);
	dao.deleteProduct(prod);
	*/
	List<Product> prod = dao.getAllProducts();
	prod.forEach(System.out::println);
	}
}