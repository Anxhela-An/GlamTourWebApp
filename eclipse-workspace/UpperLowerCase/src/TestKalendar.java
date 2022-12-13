import java.text.SimpleDateFormat;
public class TestKalendar 

{ 
	public static void main(String []args)
	{  Kalendar k1 = new Kalendar();
	  
	   Kalendar k2 = new Kalendar(1234567898765L);
	   k2.setCalendar(1234567898765L);
	   SimpleDateFormat s = new SimpleDateFormat("dd.M.yyyy HH:mm:ss");
	   System.out.println(s.format(k2.getCalendar()));	   
	}

}
