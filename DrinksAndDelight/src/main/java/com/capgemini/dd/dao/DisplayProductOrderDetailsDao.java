package com.capgemini.dd.dao;

import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.dto.DisplayProductOrderDetailsDto;
import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.util.Repository;

public class DisplayProductOrderDetailsDao
{
	
	Repository object = new Repository();
	
	//Creating a Set collection
	
	public Set<DisplayProductOrderDetailsDto> getProductDisplay(String a, String b,LocalDate c,LocalDate d) throws NotFoundException
	{
		Set<DisplayProductOrderDetailsDto> list1= new LinkedHashSet<DisplayProductOrderDetailsDto>();
	object.addingDisplayProductOrderDetails();	
	// creating a getProductDisplay and calling a method from Repository
	
	Map<Integer,DisplayProductOrderDetailsDto> map1=object.getDisplayProductOrderDetails();

	int count=0;
	for(Map.Entry<Integer,DisplayProductOrderDetailsDto> map:map1.entrySet())
	{
		DisplayProductOrderDetailsDto obj= map.getValue();
		String s=obj.getSupplierId1();
		String p=obj.getDeliveryStatus();
		if(a.contentEquals(s))
		{
			if(b.contentEquals(p)) 
			{
					for( LocalDate date =c; date.isBefore(d);date=date.plusDays(1))
					{
				
							list1.add(obj);
							count++;
				     }
			
		      }
		}
		
	}
	
	if(count==0)
	{
		//Throwing a NoTFoundexception if user cannot give a correct SupplierID
		throw new NotFoundException(" SupplierID & Delivery Status are Not Found");
	}
	else
	  return list1;
	
	}
}
