package com.productapp.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="store_ratings_table")
public class StoreRatings {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private int ratings;
	@OneToOne
	@JoinColumn(name="store_id")
	
	private Store store;
	@OneToOne @JoinColumn(name="userId")
	@JsonIgnore
	private User user;

	/**
	 * @return the ratings
	 */
	public synchronized int getRatings() {
		return ratings;
	}

	/**
	 * @param ratings the ratings to set
	 */
	public synchronized void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public StoreRatings(int ratings) {
		super();
		this.ratings = ratings;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public StoreRatings(int ratings, Store store, User user) {
		super();
		this.ratings = ratings;
		this.store = store;
		this.user = user;
	}

	public StoreRatings() {
		
	}
	
	
	
	
	
	
	
	

}
