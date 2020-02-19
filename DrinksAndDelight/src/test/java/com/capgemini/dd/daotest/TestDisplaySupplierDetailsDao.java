package com.capgemini.dd.daotest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

import com.capgemini.dd.dao.DisplaySupplierDetailsDao;

public class TestDisplaySupplierDetailsDao
{
	
	DisplaySupplierDetailsDao objectDao = new DisplaySupplierDetailsDao();
	Integer list2 [] = {6,5,4,3,2,1};
	
	  
	  @Test
	  
	  
	  
		public void testgetId()
		{
		  
		 List<Integer>list= objectDao.getId();
		 
		 
		assertArrayEquals(list2,list.toArray());
		  
		  
		}
		
	
		
	@Test
	public void testGetSupplierDetails()
	{
		assertEquals("1 Daring Drinks Vizag,Andhrapradesh 9592939955",objectDao.getDisplaySupplierDetailsDao(1));
	
	}
	
	@Test
	public void testGetSupplierDetails2()
	{
		// //assertEquals() methods checks that the two objects are equals or not.
		// Testing for the null case
		assertEquals(null,objectDao.getDisplaySupplierDetailsDao(9));
	}
}
