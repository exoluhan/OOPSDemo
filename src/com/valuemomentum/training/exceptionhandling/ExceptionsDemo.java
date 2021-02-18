package com.valuemomentum.training.exceptionhandling;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		String languages[]= {"C","C++","Java","Peril","Python"};
		
		try
		{
			for(int c=1;c<=5;c++)  // if c<=5 error- out of array bounds
			{
				System.out.println(languages[c]);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);  // e is object
			System.out.println(e.getMessage()); //e is converted to string
			e.printStackTrace();
		}
		

	}

}
