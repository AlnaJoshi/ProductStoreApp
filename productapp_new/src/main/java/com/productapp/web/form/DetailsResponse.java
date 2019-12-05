package com.productapp.web.form;

public class DetailsResponse {
	
	private String details;

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

	public DetailsResponse(String details) {
		super();
		this.details = details;
	}
	
	
	

}
