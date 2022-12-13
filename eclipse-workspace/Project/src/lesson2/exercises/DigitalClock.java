package lesson2.exercises;

public class DigitalClock {
	
	/**
	 * Beje kete klase te varur nga zona e kohes.
	 * */

	public static final byte MIN_HOUR_VALUE = 0, 
							 MAX_HOUR_VALUE = 23,
							 MIN_MINUTE_VALUE = 0,
							 MAX_MINUTE_VALUE = 59,
							 MIN_SECONDE_VALUE = 0,
							 MAX_SECONDE_VALUE = 59;
	
	public static final int SECONDS_OF_DAY = 86_400;
	public static final short SECONDS_OF_HOUR = 3_600;
	public static final short MILLIS_OF_SECONDE = 1_000;
	public static final byte SECONDS_OF_MINUTE = 60;
	
	private byte hour, minute, seconde;

	public DigitalClock() {
		this(getSecondsByMidnight());
	}

	private static int getSecondsByMidnight() { 
		return (int)(System.currentTimeMillis() / 
							MILLIS_OF_SECONDE % 
								SECONDS_OF_DAY);
	}

	public DigitalClock(byte hour) {
		this(hour, 0, 0);
	}

	public DigitalClock(int secondsByMidnight) {
		 setDigitalClock(secondsByMidnight);
	}

	private void setDigitalClock(int secondsByMidnight) {
		if(secondsByMidnight < 0 || 
		   secondsByMidnight >= SECONDS_OF_DAY) {
			hour = MIN_HOUR_VALUE;
			minute = MIN_MINUTE_VALUE;
			seconde = MIN_SECONDE_VALUE;
			return;
		}
		hour = (byte) (secondsByMidnight / SECONDS_OF_HOUR);
		minute = (byte) (secondsByMidnight % SECONDS_OF_HOUR / 
								SECONDS_OF_MINUTE);
		seconde = (byte) (secondsByMidnight % SECONDS_OF_HOUR % 
								SECONDS_OF_MINUTE);
	}

	public DigitalClock(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public DigitalClock(int hour, int minute, int seconde) {
		if(hour < MIN_HOUR_VALUE || 
		   hour > MAX_HOUR_VALUE) {
			//ndalo krijmin e objektit
			hour = MIN_HOUR_VALUE;
		}
		if(minute < MIN_MINUTE_VALUE || 
		   minute > MAX_MINUTE_VALUE) {
			//ndalo krijmin e objektit
			minute = MIN_MINUTE_VALUE;
		}
		if(seconde < MIN_SECONDE_VALUE || 
		   seconde > MAX_SECONDE_VALUE) {
			//ndalo krijmin e objektit
			seconde = MIN_SECONDE_VALUE;
		}
		this.hour = (byte) hour;
		this.minute = (byte) minute;
		this.seconde = (byte) seconde;
	}

	public byte getHour() { 
		return hour;
	}

	public byte getMinute() { 
		return minute;
	}

	public byte getSeconde() { 
		return seconde;
	}

	public String toString() { 
		return String.format("%02d:%02d:%02d", 
							  hour, minute, seconde);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + seconde;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DigitalClock)) {
			return false;
		}
		DigitalClock other = (DigitalClock) obj;
		if (hour != other.hour) {
			return false;
		}
		if (minute != other.minute) {
			return false;
		}
		if (seconde != other.seconde) {
			return false;
		}
		return true;
	} 

}