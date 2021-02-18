package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>(); // creating arraylist
		
		al.add("Jim"); // adding object in too arraylist
		al.add("Michael");
		al.add("James");
		al.add("Andy");
		
		// transversing elements using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		System.out.println(al.get(1)); // printing only 1 element
		
		al.add(3,"Tae"); //adding element in specified index
		al.remove(4); // delete content
		al.set(1, "Suga"); // replace existing content
		
		System.out.println("***Display using for Each Loop***");
		
		for(String i:al) // for each loop
		{
			System.out.println(i);
		}

	}

}
