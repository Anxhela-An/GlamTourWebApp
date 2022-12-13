package lesson3;

import java.util.ArrayList;

import lesson1.Id;
import lesson2.exercises.Date;

public class Responsibility {
	
/**
    id
 	titull			nuk mund te ndryshoje
   	pershkrim	 
	date fillimi	jo nqs dita e sotme e ka kaluar
					kete date	
	date mbarimi
	orari			i ndryshueshem vetem per te ardhmen
					orare te te shkuares te mos ndryshohen
 **/
	
	private Id id;
	private String title, description;
	private Date startDate, endDate;
	private ArrayList<TimeDuration> timetable;
	/**
	 * Cdo bejme me orarin?
	 **/

	public Responsibility(String title) {
		this(title, new Date(), null);
	}

	public Responsibility(String title, 
						  Date startDate) {
		this(title, startDate, null);
	}

	public Responsibility(String title, 
						  Date startDate,
						  Date endDate) {
		id = new Id();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public final String getTitle() {
		return title;
	}
	
	public final Id getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	/*public void setStartDate(Date startDate) { 
		if(startDate == null) {
			return;
		} 
		if(new Date().after(startDate)) {
			return;
		}
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate) {
		if(endDate != null && 
		   endDate.before(startDate)) {
			return;
		}
		this.endDate = endDate;
	}

	public void addTimeDuration(TimeDuration time) {
		if(time != null /**&& nuk eshte ne te shkuaren*/ //) {
	//		timetable.add(time);
	//	}
	//}

	public void removeTimeDuration(TimeDuration time) {
		if(time != null /**&& eshte ne te ardhmen*/) {
			timetable.remove(time);
		}
	}
	
	public int getTimetableSize() {
		return timetable.size();
	}
	
	public TimeDuration getTimeDuration(int index) {
		if(index < 0 || index > getTimetableSize() - 1) {
			return null;
		}
		return timetable.get(index);
	}
	
}