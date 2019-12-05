package com.productapp.web.form;

import java.util.List;

import com.productapp.model.entities.Store;
import com.productapp.model.entities.StoreRatings;

public class StoreResponse {
	
	
	
	private List<StoreRatings> rating;

	/*public List<Store> getStoreList() {
		return storeList;
	}

	public void setStoreList(List<Store> storeList) {
		this.storeList = storeList;
	}*/

	public List<StoreRatings> getRating() {
		return rating;
	}

	public void setRating(List<StoreRatings> rating) {
		this.rating = rating;
	}

	
	
	

}
