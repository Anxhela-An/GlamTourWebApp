package lesson1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Example6 {

	/**
	 * Java API
	 * 		Date
	 * 		Random
	 * 		GregorianCalendar
	 * UML
	 **/
	
	public static void main(String[] args) {
		
		//testDate();
		//testRandom();
		testGregorianCalendar();
		
	}
	 
	private static void testGregorianCalendar() {
		GregorianCalendar calendar1 = 
				new GregorianCalendar();
		//objekt per kete moment
		GregorianCalendar calendar2 =
				new GregorianCalendar(2021, 3, 13);
		GregorianCalendar calendar3 =
				new GregorianCalendar(2021, 3, 13, 10, 24, 25);

		print(calendar1);
		print(calendar2);
		print(calendar3);
		
		calendar1.set(GregorianCalendar.DAY_OF_MONTH, 25);
		print(calendar1);
		
	}

	private static void print(GregorianCalendar c) {
		System.out.println(
				c.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
				c.get(GregorianCalendar.MONTH) + "/" + 
			    c.get(GregorianCalendar.YEAR));
	}

	private static void testRandom() {
		Random random = new Random(2);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextDouble());
	} 

	private static void testDate() {
		Date d1 = new Date();
		//krijon objekt te ketij momenti
		Date d2 = new Date(1234567899999L);
		//krijon objekt duke llogaritur
		//daten e nisur nga 1 janar 1970 dhe
		//shtuar 123456789 milisekonda
		System.out.println(d1);
		System.out.println(d2);
		d1.setTime(d2.getTime());
		System.out.println(d1);
	}
	
}
