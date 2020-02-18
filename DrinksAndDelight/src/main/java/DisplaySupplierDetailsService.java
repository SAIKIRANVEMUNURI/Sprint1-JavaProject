

import com.capgemini.dd.dao.DisplaySupplierDetailsDao;
import com.capgemini.dd.util.SupplierRepository;
import java.util.*;
import com.capgemini.dd.dto.*;
import com.capgemini.dd.exceptions.NoDataFoundException;

public class DisplaySupplierDetailsService
{

	DisplaySupplierDetailsDao obj=new DisplaySupplierDetailsDao();
	SupplierRepository obj1=new SupplierRepository();
	Map<Integer,DisplaySupplierDetailsDto> map=obj1.get();
  
	List<Integer> list1= new ArrayList<Integer>();
	public List<Integer> getId()
	
	{
		list1=obj.getId();
		return list1;
		
		
	}
	
	public String getDistributorDetailsDetails(Integer a)
	{
		
       int flag=0;
		String result="no Data";
		for(Map.Entry<Integer,DisplaySupplierDetailsDto> map1:map.entrySet())
		{
			
			if(a==map1.getKey())
			{
				
			 result=obj.getDisplaySupplierDetailsDao(a);
			
			flag=1;
				
			}
			
			
			
		}
		try
		{
		if(flag==0)
		{
			throw new NoDataFoundException("Not Valid Id");
		}
		}
		
		catch (NoDataFoundException e)
		{
			System.out.println(e);
		}
		
		return result;
		
	}
	

}
