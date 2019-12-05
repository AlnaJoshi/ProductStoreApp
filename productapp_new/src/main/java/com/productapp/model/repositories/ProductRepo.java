package com.productapp.model.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.productapp.model.entities.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{
	//@Query("select p from Product p where p.name=?1")
	public Optional<Product> findProductByProductName(String name);
	public List<Product> findProductByProductNameContaining(String keyword);
	@Query("select p.details from Product p where p.id=?1 ")
	public String getProductDetails(Long id);
}
