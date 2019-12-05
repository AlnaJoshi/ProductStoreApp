package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.entities.Product;
import com.productapp.model.entities.Store;
import com.productapp.model.entities.StoreRatings;
import com.productapp.model.entities.User;
import com.productapp.model.repositories.ProductRepo;
import com.productapp.model.repositories.StoreRatingRepo;
import com.productapp.model.repositories.StoreRepo;
import com.productapp.model.repositories.UserRepo;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private StoreRepo storeRepo;
	
	@Autowired
	private StoreRatingRepo ratingRepo;

	@Override
	public void run(String... args) throws Exception {
	/*Product p1 = new Product("nokia 2600","details of nokia 2600",2567);
		Product p2 = new Product("nokia 567","details of nokia 567",12346);
		Product p3 = new Product("samsung galaxy","details of samsung galaxy",22567);
		Product p4 = new Product("samsung duos","details of samsung duos",12567);
		
		
		Store s1  = new Store("ABC","ABC address","bangalore");
		Store s2 = new Store("DEF","DEF address","bangalore");
		
		s1.getProductList().add(p1);
		s1.getProductList().add(p2);
		s1.getProductList().add(p3);
		s1.getProductList().add(p4);
		
		
		s2.getProductList().add(p1);
		s2.getProductList().add(p4);
		
		
		
		
	p1.getStoreList().add(s1);
		p2.getStoreList().add(s1);
		p3.getStoreList().add(s1);
		p4.getStoreList().add(s1);
		
		p1.getStoreList().add(s2);
		p4.getStoreList().add(s2);
	
		storeRepo.save(s1);
		storeRepo.save(s2);
		productRepo.save(p1);
		productRepo.save(p2);
		productRepo.save(p3);
		productRepo.save(p4);
		 
		
		
		productRepo.save(p1);
		productRepo.save(p2);
		productRepo.save(p3);
		productRepo.save(p4);
		
		User user = new User("anu","anu@gmail.com","anu123");
		userRepo.save(user);
		
		
		
		StoreRatings rating = new StoreRatings(5, s1, user);
		ratingRepo.save(rating);



		
		User user1 = new User("sree","sree@gmail.com","sree123");
		userRepo.save(user1);
		

		
	*/
		
		
		
		
		
	}

}
