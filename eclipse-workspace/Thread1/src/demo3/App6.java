package demo3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App6 
{
	private volatile boolean running = true;
	private BlockingQueue<Integer>queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[]args)
	{
		App6 app = new App6();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					app.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					app.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Press return key to stop...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		app.shutdown();
	}
	private void producer() throws InterruptedException
	{
		Random random = new Random();
		
		while(running)
		{
			queue.put(random.nextInt(100));
	
		}
	}
	public void shutdown()
	{
		running=false;
	}
	private void consumer() throws InterruptedException
	
	{
		Random random = new Random();
		while(running)
		{
			Thread.sleep(100);
			if(random.nextInt(10)==0)
			{
				Integer value = queue.take();
				System.out.println("Taken value: "+value+"; queue size is "+queue.size());
			}
		}
	}

}
