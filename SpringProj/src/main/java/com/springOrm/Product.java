package com.springOrm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ProductRecords")
public class Product {
		@Id
		@Column (name = "Product_ID")
		private int productId;
		@Column (name = "Product_Name")
		private String productName;
		@Column (name = "Product_Price")
		private double productPrice;
		
		//generate getters and setters methods
		
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
		public double getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		@Override
		public String toString() {
			return  productId +" " +productName +" " +productPrice;
		}
		
		
}
