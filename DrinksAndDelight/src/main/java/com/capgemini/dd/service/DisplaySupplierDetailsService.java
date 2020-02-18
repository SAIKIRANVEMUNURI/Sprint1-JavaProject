package com.capgemini.dd.service;

import com.capgemini.dd.dao.DisplaySupplierDetailsDao;
import java.util.*;
import com.capgemini.dd.exceptions.NoDataFoundException;

public class DisplaySupplierDetailsService
{

	DisplaySupplierDetailsDao obj=new DisplaySupplierDetailsDao();
    
	List<Integer>IdList=new ArrayList<Integer>();
    public List<Integer> getId()
	{
		 IdList=obj.getId();
		 return IdList;
	}
    
       
    
	
	public String getSipplierDetailsDetails(Integer orderId) throws  NoDataFoundException
	{
		
        String result=null;
		
		for(Integer i:IdList)
		{
			
			if(i==orderId)
			{
				
			 result= obj.getDisplaySupplierDetailsDao(orderId);
			
			}
		
			
		}
	
		if(result ==null)
		{
			
			throw new NoDataFoundException(" not valid id");
		}
		else
		{
			return result;
		}
		
	}
	
}
