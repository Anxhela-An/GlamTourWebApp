package lesson2;

import java.util.GregorianCalendar;

public class TestPerson {

	public static void main(String[] args) {
		
		Person person = new Person(null);
		 
		long id = person.getId() ///kthen objekt te klases Id
								 ///kthen referencen e objektit
		 .getId()				 ///metoda getId e klases Id
		 						 ///kthen vleren e id si vlere long
	
		 ;
		
		/**
		 * Nuk ekzsiton mundesia te ndryshosh id
		 * sepse metoda getId e klases Person kthen
		 * objekt te klases Id qe nuk ka metoda
		 * qe ja ndryshojne permbajtjen (setter).
		 * */
		
		System.out.println(id);
		
		GregorianCalendar bd = new GregorianCalendar();
		bd.setTimeInMillis(person.getBirthdateInMillis());
		
		person.setAddress(new Address(new Location(10)));
		 

		PhoneNumber phone = new PhoneNumber((short)355, (short)68, 9090200L);
		
		person.addPhoneNumber(phone);
		person.addPhoneNumber(phone);
		person.addPhoneNumber(phone);
		person.addPhoneNumber(phone);
		
		System.out.println(person.getPhoneNumbersSize());
		
		System.out.println(person.getPhoneNumber(0).getPrefix() + " " + 
						   person.getPhoneNumber(0).getOperator() + " " + 
						   person.getPhoneNumber(0).getSimNumber());
		
	}
	
}




