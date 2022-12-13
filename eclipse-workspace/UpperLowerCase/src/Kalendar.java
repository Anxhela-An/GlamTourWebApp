import java.util.Calendar;
public class Kalendar 
{ private Ora ora;
  private Data d;
  private int LeapYear;
  private long millis;
  public Kalendar()
  {
	  Calendar.getInstance();
  }
  public Kalendar(long millis)
  {
	  this.millis=millis;
  }
  public Kalendar(Data d,Ora ora)
  {
	  this.d=d;
	  this.ora=ora;
  }
  public Ora getOra()
  {
	  return ora;
  }
  public Data getData()
  {
	  return d;
  }
  public void setCalendar(long millis)
  {
	  this.millis=millis;
  }
  public long getCalendar()
  {
	  return millis;
  }
  
}
