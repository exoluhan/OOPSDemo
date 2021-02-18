package com.valuemomentum.training.io;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		
		try
		{
			Reader reader= new FileReader("c:/demo/data.txt");
			int data = reader.read(); // returns unicode(ASCII) value of the character
			while(data != -1) //-1 when stream ends
			{
				System.out.print((char)data);
				data= reader.read();
			}
			reader.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
