package com.productapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="product_table")
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private String details;
	private double price;
	
	@ManyToMany
	@JoinTable(name="store_product_table",joinColumns={@JoinColumn(name="pid_fk")}
    , inverseJoinColumns={@JoinColumn(name="sid_fk")})
	@JsonIgnore
	private List<Store> storeList = new ArrayList<Store>();
	
	public void addStore(Store store){
		storeList.add(store);
	}
	
	@ManyToMany(mappedBy = "productList")
	@JsonIgnore
	private List<Order> orders = new ArrayList<Order>();
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
	 * @return the productName
	 */
	public synchronized String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public synchronized void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the details
	 */
	public synchronized String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public synchronized void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the price
	 */
	public synchronized double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public synchronized void setPrice(double price) {
		this.price = price;
	}
	public Product(String productName, String details, double price) {
		super();
		this.productName = productName;
		this.details = details;
		this.price = price;
	}
	/**
	 * @return the storeList
	 */
	public synchronized List<Store> getStoreList() {
		return storeList;
	}
	/**
	 * @param storeList the storeList to set
	 */
	public synchronized void setStoreList(List<Store> storeList) {
		this.storeList = storeList;
	}
	/**
	 * @return the orders
	 */
	public synchronized List<Order> getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public synchronized void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Product() {
	}
	
	
	
	
	
	
	
	

}
