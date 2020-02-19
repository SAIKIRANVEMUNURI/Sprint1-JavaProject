package com.capgemini.dd.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

import com.capgemini.dd.dao.DisplayProductOrderDetailsDao;
import com.capgemini.dd.dto.DisplayProductOrderDetailsDto;

import com.capgemini.dd.exceptions.NotFoundException;

public class DisplayProductOrderDetailsService
{

	DisplayProductOrderDetailsDao object=new DisplayProductOrderDetailsDao();
	
	public Set<DisplayProductOrderDetailsDto> getDisplay (String w,String x,LocalDate y,LocalDate z ) throws NotFoundException
	{
		Set<DisplayProductOrderDetailsDto> result=null;

			result = object.getProductDisplay(w, x, y, z);
			if(result==null)
			{
				//throwing a NotFoundException if the user input doesnot matches with the Repository data and 
				//printing the exception message
				throw new NotFoundException(" SupplierID & Delivery Status are Not Found");
			}
			else
			{
		  return result;
			}
		
	}
	

	
	
	
	public boolean validate(String date) 
	{
//		
		if(date.matches("\\d{4}-\\d{2}-\\d{2}")){
			return true;
		}
		else {
			return false;
		}
	} 
	
	
	
}
