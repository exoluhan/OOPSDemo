package com.valuemomentum.training.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	private static final File f = null;

	public static void main(String[] args) {
		
		File f= new File("c:/test/hello.txt");
		try
		{
			
			if(f.createNewFile())
			{
				System.out.println("New File created");
			}
			else
			{
				System.out.println("The file already exists");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Name of the file: "+f.getName());
		System.out.println("Path of the file: "+f.getPath());
		System.out.println("file last modified: "+new Date(f.lastModified()));
		System.out.println("parent directory: "+f.getParent());
		System.out.println("Size of the file: "+f.length());
	}

}
