package com.capgemini.dd.servicetest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;

import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.service.DisplaySupplierDetailsService;

public class TestDisplaySupplierDetailsService
{
	DisplaySupplierDetailsService supplierServiceObject= new DisplaySupplierDetailsService();
	Integer List[] = {6,5,4,3,2,1};
	
	@Test
	
	public void testGetId()
	{
		List<Integer> list = supplierServiceObject.getId();
		assertArrayEquals(List,list.toArray());

	
	}
	
	

	  @Test
	  
	  public void testGetSupplierSerivice() 
	  {
		 try
		 {
				assertEquals("1 Daring Drinks Vizag,Andhrapradesh 9592939955",supplierServiceObject.getSipplierDetailsDetails(1));

		 }
		 catch(NoDataFoundException e)
		 {
			 
		 }
	 }
	  
	  
	  
	  @Test
	  
	  public void testGetSupplierDetailsSerivice1() 
	  {
		  
		  Throwable exception =assertThrows(
				  
				  NoDataFoundException.class,()->
				  {
				  supplierServiceObject.getSipplierDetailsDetails(9);
	              }
				  
				  
		  );
		  assertEquals(" not valid id",exception.getMessage());
	  }
	  
	 	

}
