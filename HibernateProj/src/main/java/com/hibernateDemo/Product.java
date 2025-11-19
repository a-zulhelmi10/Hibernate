package com.hibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="productInfo")
public class Product {
	@Id //primary key
	@Column (name="productId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId; //we want to make this variabe=le as primary key
	@Column (name="productName")
	private String productName;
	@Column (name="price")
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return productId +" " +productName +" " +price;
	}
	
}
