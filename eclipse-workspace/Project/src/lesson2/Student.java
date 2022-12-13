package lesson2;

import java.util.GregorianCalendar;

public class Student extends lesson2.Person
{  
	private String fieldOfStudy;
	private int year;
	
	public Student(String surname,String fieldOfStudy,int year)
	{
		this(null,surname,null,0,fieldOfStudy,year);
	}
	
	public Student(String name, String surname, GregorianCalendar birthdate, int gender, 
			String fieldOfStudy, int year ) {
		super(name, surname, birthdate, gender);
		this.fieldOfStudy=fieldOfStudy;
		if(year<0)
		{
			year=2021;
		}
		this.year=year;
	}
	public void setFieldOfStudy(String fieldOfStudy)
	{
		this.fieldOfStudy=fieldOfStudy;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public int getYear() {
		return year;
	}
	public String toString()
	{
		return "lesson3.Student = [ "+super.toString() + " "+ "field of study: " +fieldOfStudy + "]";
	}

}
