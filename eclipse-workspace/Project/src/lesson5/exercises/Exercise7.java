package lesson5.exercises;

import java.util.ArrayList;

import lesson1.Util;

public class Exercise7 {
	
	public static 
		<E extends Comparable<E>> void 
			sort(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			int index = i;
			for(int j = i + 1; j < list.size(); j++) {
				if (list.get(j).compareTo
						(list.get(index)) > 0) {
					index = j;
				}
			}
			swap(list, i, index);
		}
	}

	private static <E> void swap(ArrayList<E> list,
						int i1, int i2) {
		E tmp = list.get(i1);
		list.set(i1, list.get(i2));
		list.set(i2, tmp);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =
					new ArrayList<>();
		
		list.add(12);
		list.add(26);
		list.add(7);
		list.add(10);
		list.add(667);
		
		sort(list);
		
		System.out.println(list);
		
	}
	
}
