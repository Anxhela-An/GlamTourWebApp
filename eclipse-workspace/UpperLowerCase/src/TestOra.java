import java.util.Calendar;

public class TestOra 
{   public static void main(String []args)
	{
	   Ora o1 = new Ora();
	   Ora o2 = new Ora(123456789L);
	   Ora o3 = new Ora(1,30,35);  
	   o1.setHour(Calendar.getInstance().getTimeInMillis());
	   System.out.println("Current time: " +o1.Time());
	   o2.setHour(123456789L);
	   System.out.println(o2.Time());
	   System.out.println("The time corresponding to the given parameters is: "+o3.getHour()+":"+o3.getMinutes()+":"+o3.getSeconds());
	   
	}

}
