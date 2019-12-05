package com.productapp.model.service;

import java.util.List;

import com.productapp.model.entities.Product;
import com.productapp.model.entities.Store;

public interface ProductService {
	
	
	public Product findProductById(Long id);
	public Product findProductByName(String name);
	public List<Product> findProductByNameLike(String name);
	
	public Product addProduct(Product product);
	public String getProductDetails(Long id);
	
	public Store storesWithproductAvailable(Product product);
}
