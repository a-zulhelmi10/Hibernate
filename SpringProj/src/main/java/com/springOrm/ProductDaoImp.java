package com.springOrm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class ProductDaoImp implements ProductDao{
	//injection
	@Autowired //with @Autowired, you dont need to write the setters and getters methods
	private HibernateTemplate hibernateTemplate;
	
	/*
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	*/

	@Override
	@Transactional
	public int insertProduct(Product prod) {
		return (int)hibernateTemplate.save(prod);
	}

	@Override
	@Transactional
	public void deleteProductById(int productId) {
		//first of all get related records from the table
		Product prod = hibernateTemplate.get(Product.class, productId);
		hibernateTemplate.delete(prod);
	}

	@Override
	@Transactional
	public void deleteProduct(Product prod) {
		hibernateTemplate.delete(prod);
		
	}

	@Override
	@Transactional
	public void updateProduct(Product prod) {
		hibernateTemplate.update(prod);
		
	}

	@Override
	@Transactional //@Transactional only applicable to insert,update,delete and not select(List<Product>)
	public Product getProductById(int productId) {
		return hibernateTemplate.get(Product.class, productId); 
	}

	@Override
	public List<Product> getAllProducts() {
		
		return hibernateTemplate.loadAll(Product.class);
	}

}
