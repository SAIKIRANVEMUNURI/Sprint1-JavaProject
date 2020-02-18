package com.capgemini.dd.dto;

public class DisplaySupplierDetailsDto
{
	//Creating the Supplier Details variables as private.
	
	private int supplierID ;
	private String supplierName;
	private String address;
	private String phoneNumber;
	
	//Creating parameterized constructor
	
	public DisplaySupplierDetailsDto(int supplierID, String supplierName, String address, String phoneNumber) 
	{
		super();
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	//Getters and Setters for the variables.

	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
}
