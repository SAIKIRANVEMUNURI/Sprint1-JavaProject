package com.capgemini.dd.dto;

import java.time.LocalDate;

public class DisplayProductOrderDetailsDto 

{
	//Creating the Product Order Details variables as private.

	private String distributorId;
	private String deliveryStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private String orderId;
	private String productName;
	private double numberOfUnits;
	private double price;
	
	
	
	//Creating parameterized constructor
	
	public DisplayProductOrderDetailsDto(String distributorId, String deliveryStatus, LocalDate startDate, LocalDate endDate,
			String orderId, String productName, double numberOfUnits, double price) {
		super();
		this.distributorId = distributorId;
		this.deliveryStatus = deliveryStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.orderId = orderId;
		this.productName = productName;
		this.numberOfUnits = numberOfUnits;
		this.price = price;
	}
	
	//Getters and Setters for the movie variables.

	public String getSupplierId1() {
		return distributorId;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	
	
	
	@Override
	public String toString() {
		return "DisplayProductOrderDetailsDto [distributorId=" + distributorId + ", deliveryStatus=" + deliveryStatus
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", orderId=" + orderId + ", productName="
				+ productName + ", numberOfUnits=" + numberOfUnits + ", price=" + price + "]\n";
	}
	
	
	
	
	
}
