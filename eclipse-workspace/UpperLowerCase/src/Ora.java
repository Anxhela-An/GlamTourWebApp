import java.util.Calendar;

public class  Ora 
{ private long hour;
  private long minutes;
  private long seconds;
  private long millis;
  public Ora()
  {  
	 Calendar.getInstance().getTimeInMillis();
	 
  }
  
  public String Time()
  {  
	  long seconds =  (millis / 1000) % 60;
	  long minutes = (millis / (60000)) % 60;
	  long hour = (millis/(3600000)) % 24; 
	  
	  return hour+" : "+minutes+ " : "+seconds;
	  
  }
  
  
  public Ora(long hour, long minutes,long seconds)
  {
	  if((hour>-1)&&(hour<24))
	  {
		  this.hour=hour;
	  }
	  else
	  {
		  hour=0;
	  }
	  if((minutes>-1)&&(minutes<60))
	  {
		  this.minutes=minutes;
	  }
	  else
	  {
		  minutes=0;
	  }
	  if((seconds>-1)&&(seconds<60))
	  {
		  this.seconds=seconds;
	  }
	  else
	  {
		  seconds=0;
	  }
	  
  }
   public Ora(long millis)
    {
      millis = Calendar.getInstance().getTimeInMillis();
	

    }
  public long getHour()
  {
	  return hour;
  }
  public long getMinutes()
  {
	  return minutes;
  }
  public long getSeconds()
  {
	  return seconds;
  }
  public void setHour(long millis)
  { if(millis>-1)
		  {this.millis=millis; }
  else
  {
	  millis=0;
  }
	  
  }
  public long getMillis()
  {
	  return millis;
  }

}
