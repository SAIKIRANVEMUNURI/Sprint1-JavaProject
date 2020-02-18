package com.capgemini.dd.exceptions;

public class NotFoundException extends Exception 
{
	String log;
	public NotFoundException(String s)
	{
		log=s;
	}
	
	public void printLog()
	{
		System.out.println(log);
	}
}
