package com.capgemini.dd.dto;

import java.time.LocalDate;

public class DisplayRawMaterialOrderDetailsDto
{
	private String supplierId2;
	private String deliveryStatus2;
	private LocalDate startDate2;
	private LocalDate endDate2;
	private String orderId2;
	private String productName2;
	private double numberOfUnits2;
	private double price2;
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
	public String getSupplierId2() {
		return supplierId2;
	}
	public void setSupplierId2(String supplierId2) {
		this.supplierId2 = supplierId2;
	}
	public String getDeliveryStatus2() {
		return deliveryStatus2;
	}
	public void setDeliveryStatus2(String deliveryStatus2) {
		this.deliveryStatus2 = deliveryStatus2;
	}
	public LocalDate getStartDate2() {
		return startDate2;
	}
	public void setStartDate2(LocalDate startDate2) {
		this.startDate2 = startDate2;
	}
	public LocalDate getEndDate2() {
		return endDate2;
	}
	public void setEndDate2(LocalDate endDate2) {
		this.endDate2 = endDate2;
	}
	public String getOrderId2() {
		return orderId2;
	}
	public void setOrderId2(String orderId2) {
		this.orderId2 = orderId2;
	}
	public String getProductName2() {
		return productName2;
	}
	public void setProductName2(String productName2) {
		this.productName2 = productName2;
	}
	public double getNumberOfUnits2() {
		return numberOfUnits2;
	}
	public void setNumberOfUnits2(double numberOfUnits2) {
		this.numberOfUnits2 = numberOfUnits2;
	}
	public double getPrice2() {
		return price2;
	}
	public void setPrice2(double price2) {
		this.price2 = price2;
	}
	@Override
	public String toString() {
		return "DisplayRawMaterialOrderDetailsDto [supplierId2=" + supplierId2 + ", deliveryStatus2=" + deliveryStatus2
				+ ", startDate2=" + startDate2 + ", endDate2=" + endDate2 + ", orderId2=" + orderId2 + ", productName2="
				+ productName2 + ", numberOfUnits2=" + numberOfUnits2 + ", price2=" + price2 + "]\n";
	}
	
	
	
	
	
	


}
