package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import lesson1.Id;
import lesson4.Duration;
import lesson4.Identifiable;

public class AuthorityCertificate
				implements Identifiable, Duration {
	 
	private Id id;
	private String authority;
	private String code;
	private ArrayList<String> conditions;
	private GregorianCalendar startDate, endDate;
	
	public AuthorityCertificate(String authority, 
								String code, 
								ArrayList<String> conditions,
								GregorianCalendar startDate, 
								GregorianCalendar endDate) { 
		this.authority = authority;
		this.code = code;
		this.conditions = conditions;
		this.startDate = new GregorianCalendar();
		this.startDate.setTimeInMillis
		 		(startDate.getTimeInMillis());
		this.endDate = new GregorianCalendar();
		this.endDate.setTimeInMillis
				(endDate.getTimeInMillis());
	}

	public final Id getId() {
		return id;
	}
	
	public final String getAuthority() {
		return authority;
	}
	
	public final String getCode() {
		return code;
	}
	
	public final int getConditionsSize(){
		return conditions.size();
	}
	
	public final String getCondition(int index) {
		if(index < 0 || index > getConditionsSize() - 1) {
			return null;
		}
		return conditions.get(index);
	}
	
	public long getStartDateInMillis() {
		return startDate.getTimeInMillis();
	}
	
	public long getEndDateInMillis() {
		return endDate.getTimeInMillis();
	}
	
	public void stopToday() {
		endDate = new GregorianCalendar();
	}
	
	public void setEndDate(GregorianCalendar endDate) {
		if(endDate == null)
		{
			return;
		}
		if(new GregorianCalendar().
			  compareTo(this.endDate) > 0) {
			return;
		}
		if(endDate.compareTo(new GregorianCalendar()) < 0) {
			return;
		}
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "lesson3.AuthorityCertificate ["
				+ "id=" + id 
				+ ", authority=" + authority 
				+ ", code=" + code 
				+ ", conditions=" + conditions 
				+ ", startDate=" + startDate 
				+ ", endDate=" + endDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authority == null) ? 0 : authority.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((conditions == null) ? 0 : conditions.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AuthorityCertificate)) {
			return false;
		}
		AuthorityCertificate other = (AuthorityCertificate) obj;
		if (authority == null) {
			if (other.authority != null) {
				return false;
			}
		} else if (!authority.equals(other.authority)) {
			return false;
		}
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}
		if (conditions == null) {
			if (other.conditions != null) {
				return false;
			}
		} else if (!conditions.equals(other.conditions)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		return true;
	}
	
}



