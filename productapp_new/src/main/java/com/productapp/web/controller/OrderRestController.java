package com.productapp.web.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.entities.Order;
import com.productapp.model.entities.Product;
import com.productapp.model.entities.Store;
import com.productapp.model.entities.StoreRatings;
import com.productapp.model.entities.User;
import com.productapp.model.service.OrderService;
import com.productapp.model.service.ProductService;
import com.productapp.model.service.StoreService;
import com.productapp.model.service.UserService;
import com.productapp.web.form.OrderResponse;
import com.productapp.web.form.RatingRequest;

@RestController
@RequestMapping(path="api")
public class OrderRestController {
	
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private StoreService storeService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="store/{storeId}/product/{productId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> GetProductDetails(@PathVariable(name="storeId")Long id,@PathVariable(name="productId")Long id1,@RequestBody RatingRequest request,Principal principal){
		Product product = productService.findProductById(id1);
		User user = userService.findUserByName(principal.getName());
		//
		orderService.createOrder(user,product);
		
		
		OrderResponse response = new OrderResponse();
		response.setResponse("Order placed Successfully");
		
		
		
		
		return new ResponseEntity<String>(response.getResponse(),HttpStatus.OK);
	}
	
	
	

}
