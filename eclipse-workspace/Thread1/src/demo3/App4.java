package demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor1 extends Thread
  {
	private int id;
	
	public Processor1(int id)
	{
		this.id=id;
	}
	public void run()
	{
		System.out.println("Starting: "+id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Completed: "+id);
	}
	
  }
  
  public class App4
  { 
	  public static void main(String []args)
	  {
		  ExecutorService executor = Executors.newFixedThreadPool(2);
		  
		  for(int i=0;i<5;i++)
		  {
			  executor.submit(new Processor1(i));
			  
		  }
		  executor.shutdown();
		  System.out.println("All tasks submitted");
		  
		  try {
			executor.awaitTermination(1, TimeUnit.DAYS); //if it doesn't finish withina  day, it will throw an exception
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("All tasks completed!");
	  }
	  
  }
  
