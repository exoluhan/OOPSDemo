package com.valuemomentum.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
	
		public static void main(String args[]) { 

		// Writing to a file using BufferedWriter in Java 

		try { 
		FileWriter writer = new FileWriter("c:/demo/bufferwrite.txt",true); 
		BufferedWriter bwr = new BufferedWriter(writer);  

		bwr.write("James"); 
		bwr.write("\n"); // bwr.newLine();
		bwr.write("Hobert"); 
		bwr.close(); 

		System.out.println("succesfully written to a file"); } 
		catch (IOException ioe) { 
		ioe.printStackTrace(); 

		}
		 } 
		}



