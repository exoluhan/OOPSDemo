package com.valuemomentum.training.concurrency;


class ExtendsExample
{
   public static void main(String args[])
   {
      Count cnt = new Count(); // it extends methods of thread class
      try
      {
         while(cnt.isAlive())
         {
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(1500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread's run is over" );
   }
}