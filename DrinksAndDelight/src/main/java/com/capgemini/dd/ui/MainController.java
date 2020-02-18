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
import com.capgemini.dd.util.SupplierRepository;

public class MainController {

	public static void main(String[] args) 
	{
		kiran:while(true)
		{
		System.out.println("<==============WELCOME TO DRINKS & DELIGHT=============>");
		System.out.println("Enter Digit to get Details:-");
		System.out.println("1->Display RawMaterial Orders:");
		System.out.println("2->Display Product Orders:");
		System.out.println("3->Dsiplay Supplier Details:");
		System.out.println("4->Terminate");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a) 
		
		{
		case 1:
			
			DisplayRawMaterialOrderDetailsService object=new DisplayRawMaterialOrderDetailsService();
			System.out.println("<=====TO DISPLAY RAWMATERIAL ORDER DETAILS====>");
			System.out.println("Enter Supplier ID:");
			Scanner scan1 =new Scanner(System.in);
			String r=scan1.next();
			System.out.println("Enter Delivery Status:");
			Scanner scan2 =new Scanner(System.in);
			String t=scan2.next();
			System.out.println("Enter StartDate (yyyy-mm-dd):");

			Scanner scan3 =new Scanner(System.in);
			String u=scan3.next();
			LocalDate strDate=null;
			try 
				{
				  		if(object.validate(u))
				  		{
				  			strDate=LocalDate.parse(u);
				  
				  		}
				}
			 catch(NotFoundException e)
				{
				 		e.printLog();
				}

			System.out.println("Enter EndDate (yyyy-mm-dd):");
			Scanner sc3 =new Scanner(System.in);
			String v=sc3.next();
			LocalDate enDate=LocalDate.parse(v);
			Set<DisplayRawMaterialOrderDetailsDto> obj=null;
			try 
				{
					obj=object.getDisplay(r, t,strDate,enDate);
				}
			catch(NotFoundException e)
			{
				
			}
			if(obj!=null)
			System.out.println("<====RAWMATERIAL ORDER DETAILS====>");
			System.out.print(obj);
			continue;
			
		case 2:
			
			DisplayProductOrderDetailsService object2=new DisplayProductOrderDetailsService();
			System.out.println("<====TO DISPLAY PRODUCT ORDER DETAILS====>");
			System.out.println("Enter SupplierId:");
			Scanner scc =new Scanner(System.in);
			String rrrr=scc.next();
			System.out.println("Enter Delivery Status:");
			Scanner sc11 =new Scanner(System.in);
			String tttt=sc11.next();
			System.out.println("Enter StartDate (yyyy-mm-dd):");

			Scanner sc22 =new Scanner(System.in);
			String uu=sc22.next();
			LocalDate d1=null;
			try 
				{
						if(object2.validate(uu))
				  {
						d1=LocalDate.parse(uu);
				  
				  }
			  }
			  catch(NotFoundException e)
				{
				  		e.printLog();
				}
			  
			System.out.println("Enter EndDate  (yyyy-mm-dd):");
			Scanner sc33 =new Scanner(System.in);
			String vv=sc33.next();
			LocalDate dd2=LocalDate.parse(vv);
			Set<DisplayProductOrderDetailsDto> obj2=null;
			try 
			{
				obj2=object2.getDisplay(rrrr, tttt,d1,dd2);
			}
			catch(NotFoundException e)
			{ 
				
			}
			
			if(obj2!=null)
			System.out.println("<===PRODUCT ORDER DETAILS===>");
			System.out.print(obj2);
			continue;
			
		case 3:
			
			SupplierRepository obj22=new SupplierRepository();
			obj22.put();
			Scanner scan=new Scanner(System.in);
			DisplaySupplierDetailsService obj3=new  DisplaySupplierDetailsService();
			System.out.println("<===AVAILABLE SUPPLIER ID'S===>");
			System.out.println(obj3.getId());
			sai:while (true)
				{
			System.out.println("Enter the Supplier ID:");
			int id=scan.nextInt();
			System.out.println("<===SUPPLIER DEATAILS===>");
			try 
				{
					System.out.println(obj3.getSipplierDetailsDetails(id));
				}
			catch(NoDataFoundException e)
				{
					System.out.println(e);
				}
			System.out.println("Enter 1 to See More & Enter  2 to Exit:");
			int b=scan.nextInt();
			if(b==1)
				continue sai;
			else
				break sai;
				}
			continue;
		
		   
		 case 4:
			break;
			}

			break;	

		}
	}
}

