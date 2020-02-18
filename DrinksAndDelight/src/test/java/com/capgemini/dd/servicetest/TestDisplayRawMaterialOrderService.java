package com.capgemini.dd.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.service.DisplayRawMaterialOrderDetailsService;

public class TestDisplayRawMaterialOrderService 
{
	DisplayRawMaterialOrderDetailsService object=new DisplayRawMaterialOrderDetailsService();
	
	@Test
	public void testGetRawService()
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
 
 public void testRawDetailsDao() 
 {
	  
	  Throwable exception =assertThrows(
			  
			  NotFoundException.class,()->
			  {
			  object.getDisplay("Pjjb","hgdjv",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15));
             }
			  
			  
	  );
	  //	assertEquals(" SupplierID & Delivery Status are Not Found",exception.getMessage());
 }

}
