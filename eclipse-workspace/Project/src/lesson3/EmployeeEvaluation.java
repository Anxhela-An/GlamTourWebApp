package lesson3;

import java.util.GregorianCalendar;


import lesson1.Id;
import lesson1.Util;
public class EmployeeEvaluation {

	/***
	 * info e gjitha e pandryshueshme
	 **/

	private Id id;
	private GregorianCalendar dateAndTime;
	private String title, description;

	public EmployeeEvaluation
			(String title, String description) {
		this(null, title, description);
	}

	public EmployeeEvaluation
			(GregorianCalendar dateAndTime, 
			 String title, String description) { 
		id = new Id();
		if(dateAndTime == null) {
			dateAndTime = new GregorianCalendar();
		}
		this.dateAndTime = new GregorianCalendar();
		this.dateAndTime.
			setTimeInMillis(dateAndTime.
							getTimeInMillis());
		this.title = title;
		this.description = description;
	}

	public Id getId() {
		return id;
	}

	public long getDateAndTimeInMillis() {
		return dateAndTime.getTimeInMillis();
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "lesson3.EmployeeEvaluation ["
				+ "id=" + id + 
				", dateAndTime=" + Util.getGregorianCalendarAsString(dateAndTime) + " " +
								   Util.getGregorianCalendarAsTimeString(dateAndTime) + 
				", title=" + title + 
				", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAndTime == null) ? 0 : dateAndTime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EmployeeEvaluation)) {
			return false;
		}
		EmployeeEvaluation other = (EmployeeEvaluation) obj;
		if (dateAndTime == null) {
			if (other.dateAndTime != null) {
				return false;
			}
		} else if (!dateAndTime.equals(other.dateAndTime)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}
	 
}