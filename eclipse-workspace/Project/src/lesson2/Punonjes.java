package lesson2;

import java.util.GregorianCalendar;

import lesson3.OfficeAddress;

public class Punonjes extends Person
{  
	
       private OfficeAddress oa;
	   private double wage;
	   private GregorianCalendar EmploymentDate;
	   
	   
	 public Punonjes(String surname,double wage)
	 {
		 this(surname,null,null,wage,null);
	 }
	
	public Punonjes(String surname, GregorianCalendar birthdate,OfficeAddress oa,double wage,GregorianCalendar EmploymentDate) {
		super(surname, birthdate);
		this.oa=oa;
		if(wage<0)
		{
			wage=0;
		}
		this.wage=wage;
		if(EmploymentDate == null) {
			EmploymentDate = new GregorianCalendar();
		}
		this.EmploymentDate = new GregorianCalendar();
		this.EmploymentDate.
			setTimeInMillis(EmploymentDate.
							getTimeInMillis());
	}

public long getDateAndTimeInMillis() {
		return EmploymentDate.getTimeInMillis();
}
public OfficeAddress getOa() {
	return oa;
}

public double getWage() {
	return wage;
}
public String toString()
{
	return "lesson3.Punonjes = "+super.toString() +" and wage is: " + wage;
}
   
}
