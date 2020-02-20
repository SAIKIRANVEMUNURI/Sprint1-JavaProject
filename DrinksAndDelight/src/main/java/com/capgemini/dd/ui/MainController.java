package com.capgemini.dd.ui;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.dd.dto.DisplayProductOrderDetailsDto;
import com.capgemini.dd.dto.DisplayRawMaterialOrderDetailsDto;
import com.capgemini.dd.exceptions.NoDataFoundException;
import com.capgemini.dd.exceptions.NotFoundException;
import com.capgemini.dd.service.DisplayProductOrderDetailsService;
import com.capgemini.dd.service.DisplayRawMaterialOrderDetailsService;
import com.capgemini.dd.service.DisplaySupplierDetailsService;


public class MainController {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);

		control1:while(true)
		{
		System.out.println("<==============WELCOME TO DRINKS & DELIGHT=============>");
		System.out.println("Enter Digit to get Details:-");
		System.out.println("1->Display RawMaterial Orders:");
		System.out.println("2->Display Product Orders:");
		System.out.println("3->Dsiplay Supplier Details:");
		System.out.println("4->Terminate");
		
		int input=scanner.nextInt();
		
		switch(input) 
		
		{
		case 1:
			
			DisplayRawMaterialOrderDetailsService rawServiceObject=new DisplayRawMaterialOrderDetailsService();
			System.out.println("<=====TO DISPLAY RAWMATERIAL ORDER DETAILS====>");
			System.out.println("Enter Supplier ID:");
			String supplierId=scanner.next();
			System.out.println("Enter Delivery Status:");
			String deliveryStatus=scanner.next();
			System.out.println("Enter StartDate (yyyy-mm-dd):");
			LocalDate strDate=null;
			while(true)
			{
			String inputStrDate1=scanner.next();
			if(rawServiceObject.validate(inputStrDate1)) 
			{
			strDate=LocalDate.parse(inputStrDate1);
			break;
			}
			else 
			{
			System.out.println("Enter the StartDate in Correct Format(yyyy-mm-dd):");
			}
			continue;
			}
			System.out.println("Enter EndDate (yyyy-mm-dd):");
			LocalDate endDate=null;
			while(true)
			{
			String inputEndDate1=scanner.next();
			if(rawServiceObject.validate(inputEndDate1)) 
			{
			endDate=LocalDate.parse(inputEndDate1);
			break;
			}
			else 
			{
			System.out.println("Enter the EndDate in Correct Format(yyyy-mm-dd):");
			}
			continue;
			}		
			Set<DisplayRawMaterialOrderDetailsDto> rawMaterialDtoObject=null;
			try 
			{
			rawMaterialDtoObject=rawServiceObject.getDisplay(supplierId, deliveryStatus,strDate,endDate);
			}
			catch(NotFoundException e)
			{
			System.out.println(e.getMessage());
			}
			if(rawMaterialDtoObject!=null)
			System.out.println(rawMaterialDtoObject);
				continue;
			
		case 2:
			
			DisplayProductOrderDetailsService productServiceObject=new DisplayProductOrderDetailsService();
			System.out.println("<====TO DISPLAY PRODUCT ORDER DETAILS====>");
			System.out.println("Enter DistributorID:");
			String supplierId1=scanner.next();
			System.out.println("Enter Delivery Status:");
			String deliveryStatus1=scanner.next();
			System.out.println("Enter StartDate (yyyy-mm-dd):");
			LocalDate strDate1=null;
			while(true)
			{
			String inputStrDate=scanner.next();
			if(productServiceObject.validate(inputStrDate)) 
			{
			strDate1=LocalDate.parse(inputStrDate);
			break;
			}
			else 
			{
			System.out.println("Enter the StartDate in Correct Format(yyyy-mm-dd):");
			}
			continue;
			}
			System.out.println("Enter EndDate  (yyyy-mm-dd):");
			LocalDate endDate1=null;
			while(true)
			{
			String inputEndDate=scanner.next();
			if(productServiceObject.validate(inputEndDate)) 
			{
			endDate1=LocalDate.parse(inputEndDate);
			break;
			}
			else
			{
			System.out.println("Enter the EndDate in Correct Format(yyyy-mm-dd):");
			}
			continue;
			}
			Set<DisplayProductOrderDetailsDto> productDtoObject=null;
			try 
			{
			productDtoObject=productServiceObject.getDisplay(supplierId1, deliveryStatus1,strDate1,endDate1);
			}
			catch(NotFoundException e)
			{ 
			System.out.println(e.getMessage());
			}
			
			if(productDtoObject!=null)
			System.out.println("<===PRODUCT ORDER DETAILS===>");
			System.out.print(productDtoObject);
				continue;
			
		case 3:
			
	
			DisplaySupplierDetailsService supplierServiceObject3=new  DisplaySupplierDetailsService();
			System.out.println("<===AVAILABLE SUPPLIER ID'S===>");
			System.out.println(supplierServiceObject3.getId());
			control2:while (true)
			{
			System.out.println("Enter the Supplier ID:");
			int supplierId2=scanner.nextInt();
			System.out.println("<===SUPPLIER DEATAILS===>");
			try 
			{
			System.out.println(supplierServiceObject3.getSipplierDetailsDetails(supplierId2));
			}
			catch(NoDataFoundException e)
			{
			System.out.println(e.getMessage());
			}
			System.out.println("Enter 1 to See More & Enter  2 to Exit:");
			int input2=scanner.nextInt();
			if(input2==1)
			continue control2;
			else
			break control2;
			}
				continue;
		
		   
		 case 4:
			 	break;
				}

				break;	

		}
	}
}

