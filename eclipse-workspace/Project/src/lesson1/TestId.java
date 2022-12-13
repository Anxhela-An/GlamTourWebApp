package lesson1;

public class TestId {

	public static void main(String[] args) {

		Id id1 = new Id(); 
		long id1Value = id1.getId();
		
		Id id2 = new Id();  
		long id2Value = id2.getId();
		
		Id id3 = new Id(); 
		long id3Value = id3.getId();
		
		/***
		 * Metodat jo static-e perdoren nepermjet
		 * objektit te klases ku jan koduar.
		 * */

		System.out.println(id1Value);
		System.out.println(id2Value);
		System.out.println(id3Value);
		
		System.out.println(Id.getNextId());
		
		/**
		 * getNextId() eshte metode static-e
		 * e koduar ne klasen Id.
		 * Metoda static-e ashtu si cdo antar
		 * tjeter static i nje klase perdoret
		 * nepermjet referimit me emrin e klases.
		 * EmerKlase.emerAntariStatik
		 * */
		
	}
	
}













