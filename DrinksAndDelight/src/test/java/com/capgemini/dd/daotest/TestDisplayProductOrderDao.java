package com.capgemini.dd.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dao.DisplayProductOrderDetailsDao;
import com.capgemini.dd.exceptions.NotFoundException;

public class TestDisplayProductOrderDao

{
	DisplayProductOrderDetailsDao object=new DisplayProductOrderDetailsDao();
	
	@Test
	
	public void testGetRawDisplayDao()
	{
	try
	{
		//assertEquals() methods checks that the two objects are equals or not.
		// Testing by giving a expected value
		assertEquals("PSID100 Packing LocalDate.of(2020, 02, 15) LocalDate.of(2020, 02, 25) OR100  Coke 25.0 25000.0",object.getProductDisplay("PSID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15)));
	}
	catch(NotFoundException e)
	{
		
	}
	
}
	
  @Test
	  
	  public void testRawDetailsDao() 
	  {
		  
	  // Testing for the Exception created

		  Throwable exception =assertThrows(
				  
				  NotFoundException.class,()->
				  {
				  object.getProductDisplay("PSID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15));
	              }
				  
				  
		  );
	//	  assertEquals(" SupplierID & Delivery Status are Not Found",exception.getMessage());
	  }
	  
	
	
	
	
	
}
