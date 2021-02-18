package com.valuemomentum.training.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	
	public static void main(String[] args) throws IOException
	{
		
		 DataInputStream d=new DataInputStream(new FileInputStream("c:/demo/a.txt"));
	        DataOutputStream out=new DataOutputStream(new FileOutputStream("c:/demo/a1.txt"));
	        
	        String count;
	        while((count=d.readLine())!=null)
	        {
	            String u=count.toUpperCase();
	            System.out.println(u);
	            out.writeBytes(u+",");
	        }
	        d.close();
	        out.close();
		
	}

}
