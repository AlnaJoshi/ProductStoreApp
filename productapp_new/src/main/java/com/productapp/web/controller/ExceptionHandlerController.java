package com.productapp.web.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.productapp.model.exceptions.ProductNotFoundException;
import com.productapp.model.exceptions.StoreNotFoundException;
import com.productapp.web.form.CustomErrorResponse;


@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler(ProductNotFoundException.class)
	 public ResponseEntity<CustomErrorResponse> handleAccountNotFoundEx(Exception ex) {

        CustomErrorResponse errors = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());

        return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);

    }


	
	@ExceptionHandler(StoreNotFoundException.class)
	 public ResponseEntity<CustomErrorResponse> handleCustomerNotFoundEx(Exception ex) {

       CustomErrorResponse errors = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());

       return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);

   }
	
	
	

}
