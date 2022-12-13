package lesson1.exercises;

import lesson4.Duration;

public class Chronometer implements Duration {
	
	private long startTimeInMillis, stopTimeInMillis;
	
	public Chronometer() {
		start();
	}

	public void start() {
		startTimeInMillis = System.currentTimeMillis();
	}

	public void stop() {
		stopTimeInMillis = System.currentTimeMillis();
	}
	
	public long getDuration(){
		return stopTimeInMillis - startTimeInMillis;
	}

	@Override
	public long getStartDateInMillis() {
		return startTimeInMillis;
	}

	@Override
	public long getEndDateInMillis() {
		return stopTimeInMillis;
	}

}