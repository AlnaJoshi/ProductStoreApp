package com.productapp.model.service;

import com.productapp.model.entities.Store;

public interface StoreService {
	
	public Store addStore(Store store);
	public Store findById(Long id);

}
