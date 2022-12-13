package lesson8;

import java.util.GregorianCalendar;

public class Recipe {

	private int id;
	private String title;
	private String description;
	private GregorianCalendar dateAndTime;
	
	public Recipe(int id, String title, String description, GregorianCalendar dateAndTime) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.dateAndTime = dateAndTime;
	}
	
	public GregorianCalendar getDateAndTime() {
		return dateAndTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "lesson8.Recipe ["
				+ "id=" + id 
				+ ", title=" + title 
				+ ", description=" + description 
				+ ", dateAndTime=" + dateAndTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAndTime == null) ? 0 : dateAndTime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Recipe)) {
			return false;
		}
		Recipe other = (Recipe) obj;
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
		if (id != other.id) {
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
