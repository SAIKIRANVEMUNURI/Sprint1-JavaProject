package com.capgemini.dd.dao;

import java.time.LocalDate;
import java.util.*;

import com.capgemini.dd.dto.DisplayProductOrderDetailsDto;
import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.util.Repository;

public class DisplayProductOrderDetailsDao
{
	
	Repository object = new Repository();
	Set<DisplayProductOrderDetailsDto> list1= new LinkedHashSet<DisplayProductOrderDetailsDto>();
	
	public Set<DisplayProductOrderDetailsDto> getProductDisplay(String a, String b,LocalDate c,LocalDate d) throws NotFoundException
	{
	object.addingDisplayProductOrderDetails();	
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
	
	if(count==0)
	{
		throw new NotFoundException(" SupplierID & Delivery Status are Not Found");
	}
	
		
		
	}
	return list1;
	
	}
}
