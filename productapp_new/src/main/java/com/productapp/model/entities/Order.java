package com.productapp.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_table")
public class Order {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne @JoinColumn(name="user_id")
	private User user;
	
	private LocalDate orderDate;
	
	@ManyToMany
	@JoinTable(name="order_product_table",joinColumns={@JoinColumn(referencedColumnName="id")}
    , inverseJoinColumns={@JoinColumn(referencedColumnName="id")})
	private List<Product> productList=new ArrayList<Product>();

	public Order(User user, List<Product> productList) {
		super();
		this.user = user;
		this.productList = productList;
	}
	
	
	

	public Order(User user,Product product) {
		super();
		this.user = user;
		this.orderDate = LocalDate.now();
		this.productList.add(product);
	}




	public Order() {
		
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
	 * @return the productList
	 */
	public synchronized List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public synchronized void setProductList(List<Product> productList) {
		this.productList = productList;
	}




	/**
	 * @return the user
	 */
	public synchronized User getUser() {
		return user;
	}




	/**
	 * @param user the user to set
	 */
	public synchronized void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
	

}
