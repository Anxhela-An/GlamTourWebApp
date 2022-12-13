package lesson6.exercises;

import java.util.ArrayList;

public class Exercise3 {
	
	/**
	 *	Krijo nje metode qe merr si argument
	 *  nje liste me numra dhe kthen nje liste
	 *  me numrat qe plotesojne ndonje kriter
	 *  te specifikuar.
	 *  
	 *   	Per shembull, mund te kerkojme qe
	 *   	metoda te ktheje te gjithe numrat cift.
	 *   	Per shembull, mund te kerkojme qe
	 *   	metoda te ktheje te gjithe numrat pozitiv.
	 *   	Per shembull, mund te kerkojme qe
	 *   	metoda te ktheje numrat qe jane ndermjet
	 *   	dy numrave te dhene.
	 *
	 **/
	
	@FunctionalInterface
	public static interface FilterCondition{
		boolean test(Integer num);
	}
	
	public static ArrayList<Integer> filter
				(ArrayList<Integer> list,
				 FilterCondition c){
		ArrayList<Integer> myList = new ArrayList<>();
		for(Integer num : list) {
			if(c.test(num)) {
				myList.add(num);
			}
		}
		return myList;
	}
	
	public static class FilterEvenNumbers 
			implements FilterCondition{
		@Override
		public boolean test(Integer num) {
			return num % 2 == 0;
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(10);
		myList.add(7);
		myList.add(4);
		myList.add(31);
		myList.add(-19);
		
		myList = filter(myList, new FilterEvenNumbers());
		
		System.out.println(myList);
		
		myList.add(10);
		myList.add(7);
		myList.add(4);
		myList.add(31);
		myList.add(-19);
		
		myList = filter(myList, new FilterCondition() {
			@Override
			public boolean test(Integer num) { 
				return num < 0;
			}
		});
		
		System.out.println(myList);

		myList.add(10);
		myList.add(7);
		myList.add(4);
		myList.add(31);
		myList.add(-19);
		
		myList = filter(myList, n -> n >= 5 && n <= 10);
		
		System.out.println(myList);
		
	}

}









