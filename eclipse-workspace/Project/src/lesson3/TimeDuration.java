package lesson3;

import lesson2.exercises.Date;
import lesson2.exercises.DigitalClock;

public final class TimeDuration {
	
	private Date date;
	private DigitalClock startTime, endTime;

	public TimeDuration(Date date,
						DigitalClock startTime, 
						DigitalClock endTime) {
		super();
		this.startTime = startTime;
		///endTime nuk mund te jete para
		///startTime
		this.endTime = endTime;
	}
	
	public final Date getDate() {
		return date;
	}
	
	public final DigitalClock getEndTime() {
		return endTime;
	}
	
	public final DigitalClock getStartTime() {
		return startTime;
	}

	@Override
	public String toString() {
		return "lesson3.TimeDuration ["
				+ "date=" + date + 
				", startTime=" + startTime + 
				", endTime=" + endTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TimeDuration)) {
			return false;
		}
		TimeDuration other = (TimeDuration) obj;
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (endTime == null) {
			if (other.endTime != null) {
				return false;
			}
		} else if (!endTime.equals(other.endTime)) {
			return false;
		}
		if (startTime == null) {
			if (other.startTime != null) {
				return false;
			}
		} else if (!startTime.equals(other.startTime)) {
			return false;
		}
		return true;
	} 
 
}