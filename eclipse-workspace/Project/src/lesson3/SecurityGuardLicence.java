package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SecurityGuardLicence 
			extends AuthorityCertificate {

	public SecurityGuardLicence(String authority,
								String code, 
								ArrayList<String> conditions,
								GregorianCalendar startDate, 
								GregorianCalendar endDate) {
		super(authority, code, conditions, startDate, endDate);
	}

	@Override
	public String toString() {
		return "lesson3.SecurityGuardLicence [toString()=" +
						super.toString() + "]";
	}
	
}