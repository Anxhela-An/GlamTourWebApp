package lesson2;

public class Instructor extends Punonjes

{
 private int hoursOfTeaching;

  public Instructor(String surname, double wage,int hoursOfTeaching)
    {
	super(surname, wage);
		if(hoursOfTeaching <0)
		{
			hoursOfTeaching=0;
		}
		this.hoursOfTeaching=hoursOfTeaching;
	}

public int getHoursOfTeaching() {
	return hoursOfTeaching;
}

public String toString()
{
	return "lesson3.Instructor = " + super.toString()+ " and hours of teaching are: " +hoursOfTeaching;
}

}
