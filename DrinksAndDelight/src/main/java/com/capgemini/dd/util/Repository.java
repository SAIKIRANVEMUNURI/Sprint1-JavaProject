package com.capgemini.dd.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.dd.dto.DisplayProductOrderDetailsDto;
import com.capgemini.dd.dto.DisplayRawMaterialOrderDetailsDto;



public class Repository   //A repository class to store the Data like a Database
{
	
	// Created a Map to store the key and values.

	public static Map<Integer,DisplayProductOrderDetailsDto> displayProductOrderRepository = new HashMap<Integer,DisplayProductOrderDetailsDto>();

	
	// Created a method to store the data

	public void addingDisplayProductOrderDetails()
	{
		displayProductOrderRepository.put(1,new DisplayProductOrderDetailsDto("PDID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25)," OR100","Coke",25.0,25000.0));
		displayProductOrderRepository.put(2,new DisplayProductOrderDetailsDto("PDID101","Dispatch",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25),"OR101","Pepsi",25.0,25000.0));
		displayProductOrderRepository.put(3,new DisplayProductOrderDetailsDto("PDID102","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25),"OR102","Limca",25.0,25000.0));
		displayProductOrderRepository.put(4,new DisplayProductOrderDetailsDto("PDID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25),"OR103","ThumsUp",25.0,25000.0) );
		displayProductOrderRepository.put(5,new DisplayProductOrderDetailsDto("PDID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 20)," OR104","Fanta",25.0,25000.0));
		displayProductOrderRepository.put(6,new DisplayProductOrderDetailsDto("PDID100","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 23)," OR105","Maaza",25.0,25000.0));

	}
	
	public Map<Integer,DisplayProductOrderDetailsDto> getDisplayProductOrderDetails(){
		return displayProductOrderRepository;
	}
	
	
	
	// Created a Map to store the key and values.

	public static Map<Integer,DisplayRawMaterialOrderDetailsDto> displayRawMaterialOrderRepository = new HashMap<Integer,DisplayRawMaterialOrderDetailsDto>();

	
	// Created a method to store the data

	public void addingDisplayRawMaterialOrderDetails()
	{
		displayRawMaterialOrderRepository.put(1,new DisplayRawMaterialOrderDetailsDto("PSID100","Dispatch",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25)," OR100","Coke",25.0,25000.0));
		displayRawMaterialOrderRepository.put(2,new DisplayRawMaterialOrderDetailsDto("PSID101","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25),"OR101","Pepsi",25.0,25000.0));
		displayRawMaterialOrderRepository.put(3,new DisplayRawMaterialOrderDetailsDto("PSID102","Packing",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 23),"OR102","Limca",25.0,25000.0));
		displayRawMaterialOrderRepository.put(4,new DisplayRawMaterialOrderDetailsDto("PSID100","Dispatch",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 25),"OR103","ThumsUp",25.0,25000.0) );
		displayRawMaterialOrderRepository.put(5,new DisplayRawMaterialOrderDetailsDto("PSID100","Dispatch",LocalDate.of(2020, 02, 15),LocalDate.of(2020, 02, 20)," OR104","Fanta",25.0,25000.0));



	}
	
	public Map<Integer,DisplayRawMaterialOrderDetailsDto> getDisplayRawMaterialOrderDetails(){
		return displayRawMaterialOrderRepository;
	}
	

}
