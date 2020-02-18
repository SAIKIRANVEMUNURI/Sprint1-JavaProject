package com.capgemini.dd.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.dd.dto.DisplaySupplierDetailsDto;
import com.capgemini.dd.util.SupplierRepository;

public class DisplaySupplierDetailsDao
{
	
	SupplierRepository objectRepo;
	Map<Integer,DisplaySupplierDetailsDto> repomap;
	public DisplaySupplierDetailsDao()
	{
		repomap=SupplierRepository.get();
	}
	
	public List<Integer> getId()
	{
		List<Integer> list2= new ArrayList<Integer>();
		for(Map.Entry<Integer,DisplaySupplierDetailsDto> obj:repomap.entrySet())
		{
			list2.add(obj.getKey());
		}
		return list2;
	}
	
	public String getDisplaySupplierDetailsDao(Integer id)
	{
		String result=null;
		for(Map.Entry<Integer,DisplaySupplierDetailsDto> obj:repomap.entrySet())
		{
			if(id==obj.getKey())
			{
					
				result=obj.getValue().getSupplierID()+" "+obj.getValue().getSupplierName()+" "+obj.getValue().getAddress()+" "+obj.getValue().getPhoneNumber();
			
				
					
			}
				
		 }
			
			
		 return result;

	  }
		
		
		
		
}
