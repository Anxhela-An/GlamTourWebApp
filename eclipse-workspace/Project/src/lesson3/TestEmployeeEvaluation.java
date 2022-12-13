package lesson3;

import java.util.GregorianCalendar;

import lesson1.Util;

public class TestEmployeeEvaluation {

	public static void main(String[] args) {
		
		GregorianCalendar gc = 
					new GregorianCalendar(2019, 4, 25);
		
		EmployeeEvaluation ee = 
				new EmployeeEvaluation(gc, 
						"Punonjesi i muajit",
						"Rezultate te shkelqyera");

		GregorianCalendar dateAndTime = 
				new GregorianCalendar();
		
		dateAndTime.setTimeInMillis(ee.
				getDateAndTimeInMillis());
		
		System.out.println(Util.
				getGregorianCalendarAsString(dateAndTime));
	
		gc.setTimeInMillis(0);

		dateAndTime.setTimeInMillis(ee.
				getDateAndTimeInMillis());

		System.out.println(Util.
				getGregorianCalendarAsString(dateAndTime));
	
	}
	
}
