import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Data 
{ 
	private long year;
	private long month;
	private long day;
	private long millis;
	public Data()
	{ Calendar.getInstance();		
	}
	public Data(long millis)
	{
		millis = System.currentTimeMillis();
	}
	public Data(long day,long month,long year)
	{
		if(year>0)
		{
			this.year=year;
		}
		else
		{
			year=1;
		}
		if((month>-1)&&(month<12))
		  { this.month=month;
					       
		  }
		else
		{
			month=0;
		}
		if((day>0)&&(day<31)) 
		{
			this.day=day;
		}
		else
		{
			day=1;
		}
	}
	public String Time2()
	{ 
	   day = TimeUnit.MILLISECONDS.toDays(millis);
	   year = day / 365;
	   day %= 365;
	   month = day / 30;
	   day %= 30;
	
	   		
		return day + "." + month + "." + year;
	}
	public long getYear()
	{
		return year;
	}
	public long getMonth()
	{
		return month;
	}
	public long getDay()
	{
		return day;
	}
    public void setDate(long millis)
    { this.millis=millis;
    	
    }
    public long getDate()
    {
    	return millis;
    }
   
    
}
