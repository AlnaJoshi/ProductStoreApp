package com.productapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.model.entities.Product;
import com.productapp.model.entities.Store;
import com.productapp.model.exceptions.ProductNotFoundException;
import com.productapp.model.repositories.ProductRepo;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product findProductById(Long id) {
		return productRepo.findById(id).orElseThrow(ProductNotFoundException::new);
	}

	@Override
	public Product findProductByName(String name) {

		return productRepo.findProductByProductName(name).orElseThrow(ProductNotFoundException::new);
	}
	
	

	@Override
	public List<Product> findProductByNameLike(String name) {
		return productRepo.findProductByProductNameContaining(name);
	}

	@Override
	public Product addProduct(Product product) {
		 productRepo.save(product);
		 return product;
	}

	@Override
	public Store storesWithproductAvailable(Product product) {
		
		Long productId = product.getId();
		
		return null;
	}

	@Override
	public String getProductDetails(Long id) {
		String details = productRepo.getProductDetails(id);
		return details;
	}
	

}
