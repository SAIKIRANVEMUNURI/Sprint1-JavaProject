package com.capgemini.dd.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Set;

import com.capgemini.dd.dao.DisplayRawMaterialOrderDetailsDao;
import com.capgemini.dd.dto.DisplayRawMaterialOrderDetailsDto;
import com.capgemini.dd.exceptions.NotFoundException;

public class DisplayRawMaterialOrderDetailsService
{
	DisplayRawMaterialOrderDetailsDao object = new DisplayRawMaterialOrderDetailsDao();
	public Set<DisplayRawMaterialOrderDetailsDto> getDisplay (String w,String x,LocalDate y,LocalDate z) throws NotFoundException
	{
		Set<DisplayRawMaterialOrderDetailsDto> result=null;
		
		result = object.getRawMaterialDisplay(w, x, y, z);
		if(result==null)
		{
			throw new NotFoundException(" Not Found");
		}
		else
		{
	  return result;
		}
			
	}
	
	
	public boolean validate(String date) throws NotFoundException
	{
		try
		{
		  LocalDate.parse(date);	
		 return true;
		}
		catch(DateTimeParseException dtpe)
		{
			throw new NotFoundException("Invalid date");
						
		}
	} 
	
	

	
}
