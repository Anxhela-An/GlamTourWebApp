package demo3;

public class App2 
{
	private int count = 0;
	
	public synchronized void increment()
	{
		count++;
	}
	
	public static void main(String []args)
	{
		App2 app = new App2();
		app.dowork();
		
		
	}
	
	public void dowork()
	{
		Thread t1 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					increment();
				}
				
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
		        for(int i=0;i<10000;i++)
		        {
		        	increment();
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
		
		
		System.out.println("Count is: "+ count);
	}

}
