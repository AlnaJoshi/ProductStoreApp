package com.productapp.model.service;

import com.productapp.model.entities.StoreRatings;
import com.productapp.model.entities.User;

public interface UserService {
	
	public User addUser(User user);
	public User findUserByName(String name);
	public User findUserByEmail(String email);
	
	//public void rateStore(int ratings);
	
	public void addRating(StoreRatings rating);

}
