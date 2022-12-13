package lesson3;

import lesson2.Address;
import lesson2.Person;

public class Example4 {

	public static void main(String[] args) {

		///Person < Employee < Cashier
		
		Person person = new Cashier(null);
		
		//Address address = (Address)person;
		
		Employee employee = (Employee)person;
		
		System.out.println(employee);
	/**
	 * 
	 * Tipi ne te cilen tentojme te aktrojme
	 * duhet te jete ose i njejte me tipin
	 * qe eshte perdorur per te krijuar
	 * objektin, ose njera prej superklasave
	 * te vargut te saj te trashegimise.
	 * (gabim ne zbatim)
	 * 
	 * */
	}
	

}
