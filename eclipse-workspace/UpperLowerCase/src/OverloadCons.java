
public class OverloadCons {

	public static void main(String []args)
	{
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(10);
		
		Box myclone = new Box(mybox1);
		double vol;
		vol=mybox1.volume();
		System.out.println("The volume for the box 1 is: "+vol);
		vol=mybox2.volume();
		System.out.println("The volume for the box 2 is:"+vol);
		vol=mybox3.volume();
		System.out.println("The volume for the box 3 is:"+vol);
		vol=myclone.volume();
		System.out.println("The volume of the clone is:"+vol);
		
	}
	}