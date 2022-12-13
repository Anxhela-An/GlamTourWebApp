package lesson3;

import lesson2.Person;

public class TestInstanceof {
	
	public static void main(String[] args) {
		
		/**
		 * instanceof	fjale kyce
		 * 				operator boolean
		 * 				perdoret me dy argumenta
		 * 
		 * 				arg1	instanceof		arg2
		 * 
		 * 				ku arg1 eshte reference
		 * 				   arg2 eshte klase
		 * 
		 * 			    operatori teston nese objekti i
		 * 				ruajtur ne arg1 eshte i klases
		 * 				ne arg2
		 * 
		 * 		A eshte arg1 objekt i arg2?
		 * 
		 * 		true   false
		 * */
		
		String str = new String("Ckemi");

		boolean result1 = str instanceof String;
		boolean result2 = str instanceof Object;
		//boolean result3 = str instanceof Person;
		boolean result4 = null instanceof Person;	//false
		
			/**
			 * result1 eshte true
			 * result2 eshte true
			 * 
			 * instanceof kthen true per cdo klase
			 * qe ben pjese ne vargun e trashegimise
			 * se klases me te cilen eshte krijuar
			 * objekti, duke filluar nga klasa me
			 * te cilen ai eshte krijuar e vazhduar
			 * klase pas klase deri tek klasa Object
			 * 
			 * Ne result3 ka gabim kompilimi pasi
			 * objekti str eshte objekt i klases
			 * String e cila nuk eshte klase ne 
			 * te njejtin varg trashegimie me klasen
			 * Person.
			 * */

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result4);
		
		Person person = new Employee(null);

		result1 = person instanceof Person;
		result2 = person instanceof Object;
		//result3 = person instanceof String;
		result4 = person instanceof Employee;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result4);
		
		
	}

}
