package lesson6.exercises;

public enum Month
{
	JANUARY(31),
	FEBRUARY(29),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUNE(30),
	JULY(31),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);
   
	private int maxNoOfDays;
	private Month(int maxNoOfDays) {
		this.maxNoOfDays=maxNoOfDays;
	}
	public int getNoOfDays()
	{
		return maxNoOfDays;
	}
	public int getNoOfDays(int year)
	{
		if(this==FEBRUARY)
		{
			if(!isLeapYear(year))
			{
				return maxNoOfDays-1;
			}
		}
		return maxNoOfDays;
	}
	boolean isLeapYear(int year) {
		return year%4==0 && year%100!=0 || year%400==0;
	}
}