package com.valuemomentum.training.concurrency;

class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread "+ Thread.currentThread().getId()+ " is running ");
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		
		int n=8; // no. of Threads
		 
		for(int i=1;i<=n;i++)
		{
			Test t = new Test();
			t.start();
		}
		
		

	}

}
