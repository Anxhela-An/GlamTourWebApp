package lesson2;

public class Staff extends Punonjes
{
    private String position;
	public Staff(String surname, double wage,String position) {
		super(surname, wage);
		this.position=position;
	}
	
	public void setPosition(String position)
	{
		this.position=position;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString()
	{
		return "lesson3.Staff = " + super.toString()+ "and position is: "+position;
	}

}
