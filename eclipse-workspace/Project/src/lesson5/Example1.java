package lesson5;

public class Example1 {
	
	/**
	 * Cfare bejme ne kur bejme 
	 * programe?
	 * 1. Ne bejme gabime. 
	 * 		Gabime kompilimi -
	 * 		Gabime logjike  +
	 * 			gabimet logjike te
	 * 			konvertohen ne gabime kompilimi
	 * *. A mund te krijoj nje klase qe te krijoje
	 *    objekt per cfaredo gjeje?
	 *    Po!
	 * 2. Rishkruajme kod.
	 **/
	
	public static void main(String[] args) {
		
		Template person = new Template();
		person.addAttribut("name", "Tėdi");
		person.addAttribut("lastname", "Ago");
		person.addAttribut("gender", 'm');
		
		Template birthdate = new Template();
		birthdate.addAttribut("year", 1999);
		birthdate.addAttribut("month", 3);
		birthdate.addAttribut("day", 1);
		person.addAttribut("birthdate", birthdate);
		
		Template email = new Template();
		email.addAttribut("local", "jamnoizy");
		email.addAttribut("domain", "otr.al");
		person.addAttribut("email", email);
		
		Template address = new Template();
		address.addAttribut("Shteti","Shqiperi");
		address.addAttribut("Qyteti","Korce");
		address.addAttribut("Rruga","Ismail Qemali");
		address.addAttribut("Zip Code", "7001");
		person.addAttribut("Adresa",address);
		
		
		System.out.println(person);
		
		String name = (String)(person.getAttributValue("name"));
		System.out.println(name);
		
		Template location = new Template();
		location.addAttribut("latitude", 40.6252);
		location.addAttribut("longtitude", 20.9894);
		
		System.out.println(location);
		
		person.setAttributValue("name", "Noizy");
		System.out.println(person);
		
		Character gender = (Character) person.    
				getAttributValue("gender"); 
		
		System.out.println(gender);
	
	}

}



