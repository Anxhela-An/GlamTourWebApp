package lesson5;

public class Exercise4 
{  
	public static <E extends  Comparable<E>>E maksimumiVektorit(E[]vektor)
	{  E max = vektor[0];
	   for(E e: vektor)
	   {
		   if(e.compareTo(max)>0)
		   { 
			   max=e;
		   }
	   }
		
		return max;
		
		
	}

}
