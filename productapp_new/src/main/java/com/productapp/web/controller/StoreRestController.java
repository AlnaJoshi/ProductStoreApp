package com.productapp.web.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.entities.Product;
import com.productapp.model.entities.Store;
import com.productapp.model.entities.StoreRatings;
import com.productapp.model.entities.User;
import com.productapp.model.service.ProductService;
import com.productapp.model.service.StoreService;
import com.productapp.model.service.UserService;
import com.productapp.web.form.RatingRequest;
import com.productapp.web.form.RatingResponse;
import com.productapp.web.form.StoreResponse;

@RestController
@RequestMapping(path="api")
class StoreRestController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private StoreService storeService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="stores/product/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StoreRatings>>GetStores(@PathVariable(name="id")Long id){
		Product product = productService.findProductById(id);
		System.out.println(product);
		List<Store> storeList =product.getStoreList();
		List<StoreRatings> store1Ratings = new ArrayList<StoreRatings>();
		List<StoreResponse> response = new ArrayList<StoreResponse>();
		for (Store store : storeList) {
			store1Ratings.add(store.getRatings());
			//response.setRating(storeRatings);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	response.setDetails(productDetails);
		return new ResponseEntity<List<StoreRatings>>(store1Ratings,HttpStatus.OK);
	}
	
	@GetMapping(path="store/{storeId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> postResponse(@PathVariable(name="storeId")Long id,@RequestBody RatingRequest request,Principal principal){
		Store store = storeService.findById(id);
		User user = userService.findUserByName(principal.getName());
		
		System.out.println(request.getRatings()
				);
		StoreRatings ratings = new StoreRatings(request.getRatings(),store,user);
		
		userService.addRating(ratings);
		
		RatingResponse response = new RatingResponse();
		response.setResponse("ThankYou for your feedback..");
		
		return new ResponseEntity<String>(response.getResponse(),HttpStatus.OK);
	}
				

}
