package lesson2.exercises;

import lesson1.Util;

public class Date {

	public static final byte JANUARY = 1,
							 FEBRUARY = 2,
							 MARCH = 3,
							 APRIL = 4,
							 MAY = 5,
							 JUNE = 6,
							 JULY = 7,
							 AUGUST = 8,
							 SEPTEMBER = 9,
							 OCTOBER = 10,
							 NOVEMBER = 11,
							 DECEMBER = 12,
							 MIN_DAY_VALUE = 1,
							 MAX_DAY_VALUE = 31,
							 MIN_MONTH_VALUE = 1,
							 MAX_MONTH_VALUE = 12;

	public static final short FIRST_YEAR = 1970;
	public static final short FIRST_LEAP_YEAR = 1752;
	
	private byte day, month;
	private short year;
	
	public Date() {
		this((int)(System.currentTimeMillis() / 
						DigitalClock.MILLIS_OF_SECONDE / 
						DigitalClock.SECONDS_OF_DAY) + 1);       //nxjerrim ditet qe nga viti 1970
	}

	public Date(int numberOfDaysOfEpoch) {                       //jo epoka unix, por epoka e Krishtit
		if(numberOfDaysOfEpoch <= 0) {
			//ndalohet krijimi i objektit
			day = MIN_DAY_VALUE;
			month = MIN_MONTH_VALUE;
			year = FIRST_YEAR; 
		}
		else {
			setDate(numberOfDaysOfEpoch);
		}
	}
	
	private void setDate(int numberOfDaysOfEpoch) {
		///zgjidhe
		/**
		 * alternativa 1:
		 * zbres diteve numrin e diteve te muajit te radhes
		 * shtoj 1 vit sa here kapercej dhjetorin
		 * */
	    year = (short) (numberOfDaysOfEpoch/365);
	    numberOfDaysOfEpoch=numberOfDaysOfEpoch%365;
	    month=(byte) (numberOfDaysOfEpoch/maxMonthLength(month));
	    day=(byte)((numberOfDaysOfEpoch%365)/maxMonthLength(month));


	}

	public Date(int year, int month, int day) {
		if(day < MIN_DAY_VALUE ||
		   day > MAX_DAY_VALUE) {
			//nuk duhet te krijohet objekti
			day = MIN_DAY_VALUE;
		}
		if(month < MIN_MONTH_VALUE ||
		   month > MAX_MONTH_VALUE) {
			//nuk duhet te krijohet objekti
			month = MIN_MONTH_VALUE;
		}
		if(day > maxMonthLength(month)) {
			//nuk duhet te krijohet objekti
			day = MIN_DAY_VALUE;
		}
		/**
		if(year < FIRST_YEAR) {
			//nuk duhet te krijohet objekti
			year = FIRST_YEAR;
		}
		*/
		if(month == FEBRUARY) {
			if(isLeapYear(year)) {
				if(day > maxMonthLength(FEBRUARY)) {
					//nuk duhet te krijohet objekti
					day = MIN_DAY_VALUE;
				}
			}
			else {
				if(day > maxMonthLength(FEBRUARY) - 1) {
					//nuk duhet te krijohet objekti
					day = MIN_DAY_VALUE;
				}
			}
		}
		this.day = (byte) day;
		this.month = (byte) month;
		this.year = (short) year; 
	}

	private static int maxMonthLength(int month) {
		switch(month) { 
			case FEBRUARY:
				return 29;  
			case APRIL:
			case JUNE:
			case SEPTEMBER:
			case NOVEMBER: 
				return 30;  
		}
		return 31;
	}

	private static boolean isLeapYear(int year) {
		return year >= FIRST_LEAP_YEAR &&
			   (year % 4 == 0 && 
			    year % 100 != 0) ||
			   year % 400 == 0;
	}

	public String getStringDate() {
		return String.format("%d, %s %02d", 
				year, Util.months()[month-1], day);
	}

	public byte getDay() { 
		return day;
	}

	public byte getMonth() { 
		return month;
	}

	public short getYear() { 
		return year;
	}

	public String getDayOfWeek() {
		// metoda do ktheje diten e javes si string
		// psh monday, per daten 12 prill 2021
		return null;
	}

	public byte getNumberOfDayOfWeek() {
		// metoda do ktheje numrin e dites se javes
		// ku  per te henen vleren 1
		//     per te marten vleren 2
		// ... per te dielen vleren 7 
		return 0;
	}
	
}