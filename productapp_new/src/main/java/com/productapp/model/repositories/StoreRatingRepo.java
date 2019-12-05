package com.productapp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapp.model.entities.StoreRatings;

public interface StoreRatingRepo extends JpaRepository<StoreRatings,Long>{
	

}
