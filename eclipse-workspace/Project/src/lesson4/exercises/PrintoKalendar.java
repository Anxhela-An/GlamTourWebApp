package lesson4.exercises;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class PrintoKalendar 
{ 
	private int month, year;
    
	public PrintoKalendar(int month,int year)
	{
		if(month<0||month>11)
		{
			month=0;
		}
		if(year<1970)
		{
			year=1970;
		}
		this.month=month;
		this.year=year;
			
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
    public void setYear(int year)
    {
    	this.year=year;
    }
    public void Print()
    {
    	Calendar calendar = Calendar.getInstance();
    	System.out.println(month+ ", "+year);
    	String []s = { "E diel", "E hene", "E marte", "E merkure", "E enjte", "E premte", "E shtune"};
    	calendar.set(Calendar.MONTH, month-1);
    	calendar.set(Calendar.YEAR, year);
		int count=0;
	    int firstDayOfWeek = calendar.getFirstDayOfWeek();
	    int totalDayOfMonth = getTotalDayOfMonth(year,month);
    	for(int i=0; i<firstDayOfWeek;i++)
    	{ 
    		System.out.println("    ");
    		count++;
    	}
    	for(int day=1;day<=totalDayOfMonth;day++) {
			if(count==7) {
				System.out.print("\n");
				count = 0; 
			}
			System.out.printf("%-4d",day);
			count++;
		}

    }
    public static int getTotalDayOfMonth(int year,int month)
    {
    	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			return 31;
		else if(month==4||month==6||month==9||month==11)
			return 30;
		else{
			if(isLeapYear(year)) return 29;
			else return 28;
		}
    }
	private static boolean isLeapYear(int year) {
		boolean leapYearOrNot=false;
		if ((year%4==0 && year%100!=0)||year%400==0) {
			leapYearOrNot=true;
		}
		else 
			leapYearOrNot=false;
		return leapYearOrNot;

	}	

 }

