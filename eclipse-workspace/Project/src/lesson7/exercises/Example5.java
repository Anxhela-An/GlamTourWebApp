package lesson7.exercises;

public class Example5 
{ public static void main(String []args)
	{
	   Octagon o1 = new Octagon(10);
	   try
	   {
		   Octagon o2 = (Octagon) o1.clone();
		   System.out.println(o1.compareTo(o2));
	   }
	   catch(CloneNotSupportedException c)
	   {
		   c.printStackTrace();
	   }
	}

}
