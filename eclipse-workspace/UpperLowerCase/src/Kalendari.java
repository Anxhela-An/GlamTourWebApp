import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Kalendari
{    public static int dita, muaji, viti;  
      public  void setTimeinMillis(long millis) 
      { DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        Date date = new Date(millis);
        System.out.println(dateFormat.format(date));  
      }


	public static void main(String []args)
	{
		GregorianCalendar g = new GregorianCalendar();
		Kalendari k = new Kalendari();
        dita = g.get(GregorianCalendar.DAY_OF_MONTH);
        muaji = g.get(GregorianCalendar.MONTH);
        viti = g.get(GregorianCalendar.YEAR);
        System.out.println(dita+"."+muaji+"."+viti);
        System.out.println(g.getTime());
        
        k.setTimeinMillis(1234567898);
	}
	
	
	

}
