package com.springOrm;

import java.util.List;

public interface ProductDao {
	public int insertProduct(Product prod); //take object as argument
	public void deleteProductById(int productId);
	public void deleteProduct(Product prod); //delete based on object
	public void updateProduct(Product prod);
	public Product getProductById(int productId);
	public List<Product> getAllProducts();
}
