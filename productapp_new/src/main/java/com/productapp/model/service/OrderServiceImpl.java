package com.productapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.model.entities.Order;
import com.productapp.model.entities.Product;
import com.productapp.model.entities.User;
import com.productapp.model.repositories.OrderRepo;
import com.productapp.model.repositories.UserRepo;
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepo repo;
	@Autowired
	private UserRepo userRepo;

	@Override
	public void findById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order createOrder(User user,Product product) {
		Order order=new Order(user,product);
		order.setUser(user);
		repo.save(order);
		return order;
	}

}
