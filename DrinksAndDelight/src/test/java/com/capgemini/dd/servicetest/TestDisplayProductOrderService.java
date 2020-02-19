package com.capgemini.dd.servicetest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.service.DisplayProductOrderDetailsService;

public class TestDisplayProductOrderService
{
	DisplayProductOrderDetailsService object=new DisplayProductOrderDetailsService();
	
	@Test
	public void testGetProductService()
	{
	
	try {
		
		//assertEquals() methods checks that the two objects are equals or not.
		// Testing by giving a expected value
		assertEquals("PSID100 Packing LocalDate.of(2020, 02, 15) LocalDate.of(2020, 02, 25) OR100  Coke 25.0 25000.0",object.getDisplay("PSID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15)));

		}
	catch(NotFoundException e)
	{
		
	}

}
	@Test
	
	public void testNull()
	{
		try {
			
			//assertEquals() methods checks that the two objects are equals or not.
			// Testing for the null case
			assertEquals(null,object.getDisplay("Pjjb","hgdjv",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15)));
		} catch (NotFoundException e) {
			
		
		}
	}
	
	 @Test
	  
	  public void testRawDetails() 
	  {
		  
		  Throwable exception =assertThrows(
				  
				  NotFoundException.class,()->
				  {
				  object.getDisplay("Pjjb","hgdjv",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15));
	              }
				  
				  
		  );
		  	assertEquals(null,exception.getMessage());
	  }
	 
	 
	 
	 @Test
	 public void testDate()
	 {
		 assertTrue(object.validate("2020-02-15"));
		 
	 }
	 
	 @Test
	 public void testDate2()
	 {
		 assertFalse(object.validate("2020/02/15"));
		 
	 }
}