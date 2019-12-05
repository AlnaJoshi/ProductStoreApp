package com.productapp.model.service;

import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.productapp.model.entities.Store;
import com.productapp.model.repositories.StoreRepo;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.Silent.class)
public class StoreServiceTests {

	
		@InjectMocks
		private StoreService storeService;
		
		@Mock
		private StoreRepo storeRepo;
		
		
		static Store store = new Store();
		@BeforeClass
		public static void setup(){
			store.setId(2L);
			store.setStoreName("s2");
		}
		
		@Test
		public void testFindByIdForPositive(){
			Mockito.when(storeRepo.findById(Mockito.any())).thenReturn(Optional.of(store));
			Store store = storeService.findById(2L);
			Assert.assertNotNull(store);
			Assert.assertEquals("s2", store.getStoreName());
		}

		
		@Test
		public void testFindByIdForNegative(){
			Mockito.when(storeRepo.findById(2L)).thenReturn(Optional.of(store));
			Store store = storeService.findById(6L);
			Assert.assertNull(store);
		}

}
