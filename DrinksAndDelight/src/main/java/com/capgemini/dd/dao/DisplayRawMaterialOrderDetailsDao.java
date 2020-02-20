package com.capgemini.dd.dao;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.capgemini.dd.dto.DisplayRawMaterialOrderDetailsDto;
import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.util.Repository;

public class DisplayRawMaterialOrderDetailsDao
{
	
	Repository repositoryObject = new Repository();
	
	//Creating a Set collection
	Set<DisplayRawMaterialOrderDetailsDto> list2= new LinkedHashSet<DisplayRawMaterialOrderDetailsDto>();
	
	// creating a getRawMaterialDisplay and calling a method from Repository
	public Set<DisplayRawMaterialOrderDetailsDto> getRawMaterialDisplay(String a, String b,LocalDate c,LocalDate d) throws NotFoundException
	{
		repositoryObject.addingDisplayRawMaterialOrderDetails();
		Map<Integer,DisplayRawMaterialOrderDetailsDto> map2=repositoryObject.getDisplayRawMaterialOrderDetails();
		int count=0;
		for(Map.Entry<Integer,DisplayRawMaterialOrderDetailsDto> map:map2.entrySet())
		
		{
			DisplayRawMaterialOrderDetailsDto obj= map.getValue();
			String s=obj.getSupplierId2();
			String q=obj.getDeliveryStatus2();
			if(a.contentEquals(s))
			{
				if(b.contentEquals(q)) 
				{	 
					for( LocalDate date =c; date.isBefore(d);date=date.plusDays(1))
			
							{
								list2.add(obj);
								count++;
							}
				}
			}
			
		
		if(count==0)
		{
			//Throwing a NoTFoundexception if user cannot give a correct SupplierID

			throw new NotFoundException(" SupplierID & Delivery Status are Not Found");
		}
		}
		return list2;
			
			
		}
		

		
		
	}


	
	


	


