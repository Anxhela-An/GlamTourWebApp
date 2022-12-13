package lesson4;
import java.util.Arrays;
import lesson1.Util;

public class Example4 
{ //rendi sipas nje kriteri te dhene ne argument 
  //specifikon se cfare renditje do behet, psh sort(a, desc)
  //sort(a, asc),  sort(a, oddEven)
  //metoda sort te jete e projektuar te beje cfaredo lloj renditjeje
  //dhe te ndertohet vetem nje here per cdo rast te ndryshem
  //konfigurohet sipas nevojes se renditjes

	public static void sort(int []a,Condition c)
	{
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(c.test(a[j], a[index]))
				{
					index=j;
				}
			}
			Util.swap(a, i, index);
		}
	}
	public static void main(String []args)
	{
		int []a = {10,7,4,31,-19};
		sort(a, new DecSort());
		System.out.println(Arrays.toString(a));
		
	    sort(a, new NaturalSort());
		System.out.println(Arrays.toString(a));

		sort(a, new OddEven());
		System.out.println(Arrays.toString(a));
		
		sort(a,(n1,n2)->n1%2==0 && n2%2!=0);    //shprehjet lambda
		System.out.println(Arrays.toString(a));


	    
	    
	}

}
