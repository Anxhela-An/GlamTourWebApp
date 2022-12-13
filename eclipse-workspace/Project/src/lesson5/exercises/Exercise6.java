package lesson5.exercises;

import java.util.ArrayList;

public class Exercise6 {
	
	public static 
		<E extends Comparable<E>> 
			E max(ArrayList<E> l) {
		if(l.isEmpty()) {
			return null;
		}
		E r = null;
		for(E e : l) {
			if(r == null ||
			   e.compareTo(r) > 0) {
				r = e;
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		 
		ArrayList<Integer> list = 
					new ArrayList<>();
		list.add(null);
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(31);
		list.add(-19);
		System.out.println(max(list));
		
	}
	
}
