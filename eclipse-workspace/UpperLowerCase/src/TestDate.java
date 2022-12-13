import java.text.SimpleDateFormat;
import java.util.*;
public class TestDate 
{ public static void main(String []args)
	{
	   Data d1 = new Data();
	   Data d2 = new Data(1234567898765L);
	   print(d1);
	   //SimpleDateFormat sdf = new SimpleDateFormat("dd.M.yyyy");
	   d2.setDate(1234567898765L);
	   //String date = sdf.format(d2.getDate()); 
	   //System.out.println("The converted date from milliseconds is: "+date);
	   System.out.println("The converted date from milliseconds is:" + d2.Time2());  //or with long inside?
	   Data d3 = new Data(9,1,2001);
	   System.out.println("A random date chosen by the user is: "+d3.getDay()+"."+d3.getMonth()+"."+d3.getYear());
	   
	   
	   
	}

private static void print(Data d1) 
{
	Calendar cal = Calendar.getInstance();
    System.out.print("Current date is " + cal.get(Calendar.DATE));
    System.out.print("." + (cal.get(Calendar.MONTH) + 1));
    System.out.println("." + cal.get(Calendar.YEAR));
}
}

