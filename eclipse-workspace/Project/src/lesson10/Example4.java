package lesson10;

import java.util.Deque;
import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedList<>();

		deque.addFirst(10);
		deque.addFirst(7);
		deque.addFirst(4);
		deque.addFirst(31);
		deque.addFirst(-19);
		
		while(!deque.isEmpty()) {
			System.out.println(deque.removeFirst());
		}
	 
	}
	
}
	