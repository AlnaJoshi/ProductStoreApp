package com.productapp.web.form;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;


public class CustomErrorResponse {
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timeStamp;
	private int status;
	private String error;
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp() {
		this.timeStamp = LocalDateTime.now();
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public CustomErrorResponse(int status, String error) {
	
		setTimeStamp();
		this.status = status;
		this.error = error;
	}
	public CustomErrorResponse() {
		
	}
	
	

}

