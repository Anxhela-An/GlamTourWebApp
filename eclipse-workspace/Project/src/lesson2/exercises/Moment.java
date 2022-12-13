package lesson2.exercises;

public class Moment {

	private DigitalClock time;
	private Date date;
	
	/**
	 * Cfare marredhieje formohet ndermjet
	 * klases Moment dhe DigitalClock?
	 * Po Moment dhe Date?
	 * */
	
	public Moment() {
		time = new DigitalClock();
		date = new Date();
	}
	
	public Moment(int secondsByStartOfEpoch) {
		time = new DigitalClock(secondsByStartOfEpoch % 
							DigitalClock.SECONDS_OF_DAY);
		date = new Date(secondsByStartOfEpoch / 
						DigitalClock.SECONDS_OF_DAY + 1);
	}
	
	public Moment(int year, int month, int day, 
				  int hour, int minute, int seconde) {
		time = new DigitalClock(hour, minute, seconde);
		date = new Date(year, month, day);
	}
	
	public DigitalClock getTime() {
		return time;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getStringMoment(){
		return date.toString() + " " + 
				time.toString();
	}
	
}