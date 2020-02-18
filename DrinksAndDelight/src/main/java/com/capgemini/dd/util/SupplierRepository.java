package com.capgemini.dd.util;

import java.util.Hashtable;
import java.util.Map;
import com.capgemini.dd.dto.DisplaySupplierDetailsDto;

public class SupplierRepository 
{
	 	
	static Map<Integer,DisplaySupplierDetailsDto> distributorMap =new Hashtable<Integer,DisplaySupplierDetailsDto>();
	
	public void put()
	{
		
		
		
		distributorMap.put(1, new DisplaySupplierDetailsDto(1,"Daring Drinks","Vizag,Andhrapradesh","9592939955"));
		distributorMap.put(2, new DisplaySupplierDetailsDto(2,"Thrive Thrist Drinks","Hyderabad,Telangana","9948491817"));
		distributorMap.put(3, new DisplaySupplierDetailsDto(3,"Sweet Drinks","Bangalore,Karnataka","7009587511"));
		distributorMap.put(4, new DisplaySupplierDetailsDto(4,"Sip and Savor Drinks","Mumbai,Maharashtra","9115511906"));
		distributorMap.put(5, new DisplaySupplierDetailsDto(5,"Get Your Gulpe Drinks","Chennai,Tamilnadu","9010406557"));
		distributorMap.put(6, new DisplaySupplierDetailsDto(6,"Thrist Burst Drinks","Vijayawada,Andhrapradesh","8790799733"));
	
	}
	
	public static Map<Integer,DisplaySupplierDetailsDto> get() 
	{
		
		
		return distributorMap ;
		
	}


}
