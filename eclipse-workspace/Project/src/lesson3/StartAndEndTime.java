package lesson3;
import java.util.GregorianCalendar;
import lesson1.Util;

public class StartAndEndTime 
{ 	private GregorianCalendar startTime;
    private GregorianCalendar endTime;
    
    public StartAndEndTime(GregorianCalendar startTime, GregorianCalendar endTime)
    { 
    	this.startTime.
		setTimeInMillis(startTime.getTimeInMillis());
        if((endTime.DAY_OF_MONTH>=GregorianCalendar.DAY_OF_MONTH)&&(endTime.MONTH>=GregorianCalendar.MONTH)
        		&&(endTime.YEAR>=GregorianCalendar.YEAR))
        { endTime = new GregorianCalendar();
        	
        }
        else
        {this.startTime.
    		setTimeInMillis(startTime.getTimeInMillis());
        	
        }
    	
    }

    public long getDateAndTimeInMillis1() {
		return startTime.getTimeInMillis();
	}
    public long getDateAndTimeInMillis2()
    {
    	return endTime.getTimeInMillis();
    }
	

}
