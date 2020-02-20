package com.capgemini.dd.servicetest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.service.DisplayRawMaterialOrderDetailsService;

public class TestDisplayRawMaterialOrderService 
{
	DisplayRawMaterialOrderDetailsService rawMaterialServiceObject=new DisplayRawMaterialOrderDetailsService();
	
	@Test
	public void testGetRawService()
	{
	
	try {
		
		//assertEquals() methods checks that the two objects are equals or not.
		// Testing by giving a expected value
		assertEquals("[DisplayRawMaterialOrderDetailsDto [supplierId2=PSID100, deliveryStatus2=Dispatch, startDate2=2020-02-15, endDate2=2020-02-25, orderId2= OR100, productName2=Coke, numberOfUnits2=25.0, price2=25000.0]\r\n" + 
				", DisplayRawMaterialOrderDetailsDto [supplierId2=PSID100, deliveryStatus2=Dispatch, startDate2=2020-02-15, endDate2=2020-02-25, orderId2=OR103, productName2=ThumsUp, numberOfUnits2=25.0, price2=25000.0]\r\n" + 
				", DisplayRawMaterialOrderDetailsDto [supplierId2=PSID100, deliveryStatus2=Dispatch, startDate2=2020-02-15, endDate2=2020-02-20, orderId2= OR104, productName2=Fanta, numberOfUnits2=25.0, price2=25000.0]\r\n" + 
				"]",rawMaterialServiceObject.getDisplay("PSID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15)));
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
			assertEquals(null,rawMaterialServiceObject.getDisplay("Pjjb","hgdjv",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15)));
		} catch (NotFoundException e) {
			
		
		}
	}


@Test
 
 public void testRawDetailsservice() 
 {
	  
	  Throwable exception =assertThrows(
			  
			  NotFoundException.class,()->
			  {
			  rawMaterialServiceObject.getDisplay("Pjjb","hgdjv",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 15));
             }
			  
			  
	  );
	 	assertEquals(" SupplierID & Delivery Status are Not Found",exception.getMessage());
 }


@Test
public void testDate()
{
	 assertTrue(rawMaterialServiceObject.validate("2020-02-15"));
	 
}

@Test
public void testDate2()
{
	 assertFalse(rawMaterialServiceObject.validate("2020/02/15"));
	 
}

}
