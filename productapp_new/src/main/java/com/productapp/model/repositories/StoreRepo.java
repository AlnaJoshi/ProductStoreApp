package com.productapp.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.model.entities.Store;
@Repository
public interface StoreRepo extends JpaRepository<Store, Long> {

}
