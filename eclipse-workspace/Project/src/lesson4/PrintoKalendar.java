package lesson4;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
public class PrintoKalendar
{
	private int month,year;
	public PrintoKalendar(int month,int year)
	{
		if(month<0||month>11)
		{
			month=0;
		}
		this.month=month;
		if(year<1)
		{
			year=1;
		}
		this.year=year;
	}
	
	
	public void printCalendarMonthYear() {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(year, month - 1, 1); 
        System.out.println("Calendar for "+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,
                        Locale.US) + " " + cal.get(Calendar.YEAR));
        int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
        int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
        printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
    }
    private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {
        int weekdayIndex = 0; 
        System.out.println("E diel  E hene  E marte  E merkure  E enjte  E premte  E shtune"); 

        for (int i = 1; i < firstWeekdayOfMonth; i++) {
            System.out.print("    "); 
            weekdayIndex++;
        }
        for (int j = 1; j <= numberOfMonthDays; j++) {

            if (j<10)
            System.out.print(j+"   ");
            else System.out.print(j); 
            weekdayIndex++;
            if (weekdayIndex == 7) {
                weekdayIndex = 0;
                System.out.println();
            } else { 
                System.out.print("   ");
            }}}
	
	
	public static void main(String []args)
	{
		PrintoKalendar p = new PrintoKalendar(1,2021);
		p.printCalendarMonthYear();
	}
	

}
