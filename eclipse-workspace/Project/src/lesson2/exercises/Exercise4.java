package lesson2.exercises;

public class Exercise4 {
	
	public static void main(String[] args) {

		Date dateToday = new Date();
		Date _13_04_2021 = new Date(2021, Date.APRIL, 13);
		Date dateByDaysOfEpoch = new Date(10_000);

		System.out.println(dateToday.getStringDate());			//2021, april 13
		System.out.println(_13_04_2021.getStringDate());
		System.out.println(dateByDaysOfEpoch.getStringDate());

		/*System.out.println(dateToday.getDay());
		System.out.println(dateToday.getMonth());
		System.out.println(dateToday.getYear());

		System.out.println(dateToday.getDayOfWeek());			//e marte
		System.out.println(dateToday.getNumberOfDayOfWeek());	//2
		*/
	}

}
