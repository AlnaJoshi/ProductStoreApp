package com.productapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name="user_table")
public class User {
	private static BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	@OneToOne(mappedBy="user")
	private StoreRatings rating;
	
	

	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private List<Order> orders = new ArrayList<Order>();
	public void addOrder(Order order){
		orders.add(order);
		
	}
	/**
	 * @return the id
	 */
	public synchronized Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public synchronized void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public synchronized String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public synchronized void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public synchronized String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public synchronized void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public synchronized String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public synchronized void setPassword(String password) {
		this.password= encoder.encode(password);
	}
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		setPassword(password);
	}
	public User() {
	
	}
	public StoreRatings getRating() {
		return rating;
	}
	public void setRating(StoreRatings rating) {
		this.rating = rating;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
	

}
