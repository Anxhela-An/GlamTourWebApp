package lesson3;

import java.util.GregorianCalendar;

public class Example2Test 
{ public static void main(String []args)
	{
	    GregorianCalendar g1 = new GregorianCalendar(1990,1,4);
	    GregorianCalendar g2 = new GregorianCalendar(1995,3,4);
	    GregorianCalendar g3 = new GregorianCalendar(2000,2,4);
	    Employee e1 = new Employee(g1);
	    Employee e2 = new Employee(g2);
	    Employee e3 = new Employee(g3);
	    
	    Example2 e = new Example2(e1,e2,e3);
	    
        System.out.println(e.get());	    
	}

}