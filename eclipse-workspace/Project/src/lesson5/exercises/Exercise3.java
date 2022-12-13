package lesson5.exercises;

import java.util.ArrayList;

public class Exercise3 {
	
	public static <E> ArrayList<E>removeDuplicates (ArrayList<E> list)
	{
		ArrayList<E> result = 
				new ArrayList<>();
		for(E e : list) {
			if(!result.contains(e)) {
				result.add(e);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = 
				new ArrayList<>();
		
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(31);
		list.add(-19);
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(31);
		list.add(-19);
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(31);
		list.add(-19);
		
		list = removeDuplicates(list);
		
		System.out.println(list);
		
		ArrayList<String> listStr =
				new ArrayList<>();
		
		listStr.add("Hola");
		listStr.add("Alo");
		listStr.add("Hola");
		listStr.add("Hello");
		listStr.add("Hola");
		listStr.add("Hola");
		listStr.add("Hello");
		listStr.add("Hola");
		listStr.add("Alo");
		listStr.add("Hola");
 		
		listStr = removeDuplicates(listStr);
	
		System.out.println(listStr);
		
	}

}
