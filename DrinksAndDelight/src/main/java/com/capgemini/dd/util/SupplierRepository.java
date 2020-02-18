package com.capgemini.dd.util;

import java.util.Hashtable;
import java.util.Map;
import com.capgemini.dd.dto.DisplaySupplierDetailsDto;

public class SupplierRepository  //A repository class to store the Supplier Data like a Database
{
	 
	// Created a Map to store the key and values.
	static Map<Integer,DisplaySupplierDetailsDto> supplierMap =new Hashtable<Integer,DisplaySupplierDetailsDto>();
	
	
	// Created a method to store the data
	public void put()
	{
				
		supplierMap.put(1, new DisplaySupplierDetailsDto(1,"Daring Drinks","Vizag,Andhrapradesh","9592939955"));
		supplierMap.put(2, new DisplaySupplierDetailsDto(2,"Thrive Thrist Drinks","Hyderabad,Telangana","9948491817"));
		supplierMap.put(3, new DisplaySupplierDetailsDto(3,"Sweet Drinks","Bangalore,Karnataka","7009587511"));
		supplierMap.put(4, new DisplaySupplierDetailsDto(4,"Sip and Savor Drinks","Mumbai,Maharashtra","9115511906"));
		supplierMap.put(5, new DisplaySupplierDetailsDto(5,"Get Your Gulpe Drinks","Chennai,Tamilnadu","9010406557"));
		supplierMap.put(6, new DisplaySupplierDetailsDto(6,"Thrist Burst Drinks","Vijayawada,Andhrapradesh","8790799733"));
	
	}
	
	public static Map<Integer,DisplaySupplierDetailsDto> get() 
	{
		
		
		return supplierMap ;
		
	}


}
