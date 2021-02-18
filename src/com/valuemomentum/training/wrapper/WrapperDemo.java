package com.valuemomentum.training.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int num=100;
		Integer obj= Integer.valueOf(num); //--- boxing
		// Integer obj= num;--- autoboxing
		System.out.println(num+ " "+ obj);
		
		Integer obj1= new Integer(100);
		int num1= obj1.intValue(); //--- unboxing
		// int num1 = obj1;--- autounboxing
		System.out.println(num1+" "+ obj1 );
		
		int b=10;
		Integer obj3= new Integer(b);
		System.out.println(b+" "obj3);
		
		char e='a';
		Character obj4= e;
		System.out.print(obj4);
		System.out.println(" "+ Character.isUpperCase(e));
		
		double d=250.5;
		Double obj5 =new Double(d);
		System.out.print(obj5);
		System.out.print(" "+obj5.toHexString(d));
		
		
		
		
		
		

	}

}
