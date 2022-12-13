package lesson3;

import lesson2.Person;

public class Example3 {

	public static void main(String[] args) {
		
		Object o = new String("Hello Zoti Klaus!");

		Person klaus = ((Person)o);
		
		System.out.println(klaus);
		
		/**
		 * Tipi ne te cilen tentojme te aktrojme
		 * duhet te jete me patjeter nentip i
		 * tipit te deklaruar. (gabim kompilimi)
		 * 
		 * Per shembull, ne rastin tone
		 * tipi Person ne te cilin duam
		 * ta bejme cast objektin eshte
		 * nenklase e tipit Object.
		 * 
		 * Tipi ne te cilen tentojme te aktrojme
		 * duhet te jete ose i njejte me tipin
		 * qe eshte perdorur per te krijuar
		 * objektin, ose njera prej superklasave
		 * te vargut te saj te trashegimise.
		 * (gabim ne zbatim)
		 * 
		 * Ne kete rast tipi Person nuk eshte
		 * superklase e tipit String, ndaj ne
		 * zbatim do deshtoj cast.
		 * */
		
		
	}
	

}
