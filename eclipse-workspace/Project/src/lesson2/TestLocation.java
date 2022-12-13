package lesson2;

public class TestLocation 
{ public static void main(String []args)
	{
	Location loc1 = new Location(10);
	System.out.println(loc1.getLatitude());
	System.out.println(loc1.getLongitude());
	System.out.println(loc1.getPosition());

	Location loc2 = new Location(45, -49);
	System.out.println(loc2.getLatitude());
	System.out.println(loc2.getLongitude());
	System.out.println(loc2.getPosition());
	}

}
