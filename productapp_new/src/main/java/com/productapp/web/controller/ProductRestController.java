package com.productapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.entities.Product;
import com.productapp.model.service.ProductService;
import com.productapp.web.form.DetailsResponse;

@RestController
@RequestMapping(path="api")
public class ProductRestController {
	@Autowired
	private ProductService productService;
	
	
	@GetMapping(path="product",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> GetProductByNameLike(@RequestParam(name="name")String name){
		List<Product> products = productService.findProductByNameLike(name);
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	@GetMapping(path="products",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetailsResponse> GetProductDetails(@RequestParam(name="id")Long id){
		String productDetails = productService.getProductDetails(id);
		System.out.println(productDetails);
	//	response.setDetails(productDetails);
		DetailsResponse res = new DetailsResponse(productDetails);
		return new ResponseEntity<DetailsResponse>(res,HttpStatus.OK);
	}
	
	
	
	
	
	

}
