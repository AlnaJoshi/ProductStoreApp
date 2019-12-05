package com.productapp.model.service;

import com.productapp.model.entities.Order;
import com.productapp.model.entities.Product;
import com.productapp.model.entities.User;

public interface OrderService {
	
	public void findById(Long id);
	public Order createOrder(User user,Product product);

}
