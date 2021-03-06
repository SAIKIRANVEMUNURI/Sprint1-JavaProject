package com.capgemini.dd.dto;

import java.time.LocalDate;

public class DisplayRawMaterialOrderDetailsDto
{
	//Creating the RawMaterial Details variables as private.
	
	private String supplierId2;
	private String deliveryStatus2;
	private LocalDate startDate2;
	private LocalDate endDate2;
	private String orderId2;
	private String productName2;
	private double numberOfUnits2;
	private double price2;
	
	//Creating parameterized constructor
	
	public DisplayRawMaterialOrderDetailsDto(String supplierId2, String deliveryStatus2, LocalDate startDate2,
			LocalDate endDate2, String orderId2, String productName2, double numberOfUnits2, double price2)
	{
		super();
		this.supplierId2 = supplierId2;
		this.deliveryStatus2 = deliveryStatus2;
		this.startDate2 = startDate2;
		this.endDate2 = endDate2;
		this.orderId2 = orderId2;
		this.productName2 = productName2;
		this.numberOfUnits2 = numberOfUnits2;
		this.price2 = price2;
	}
	
	//Getters and Setters for the movie variables.

	public String getSupplierId2() {
		return supplierId2;
	}

	public String getDeliveryStatus2() {
		return deliveryStatus2;
	}

	
	
	@Override
	public String toString() {
		return "DisplayRawMaterialOrderDetailsDto [supplierId2=" + supplierId2 + ", deliveryStatus2=" + deliveryStatus2
				+ ", startDate2=" + startDate2 + ", endDate2=" + endDate2 + ", orderId2=" + orderId2 + ", productName2="
				+ productName2 + ", numberOfUnits2=" + numberOfUnits2 + ", price2=" + price2 + "]\n";
	}
	
	
	
	
	
	


}
