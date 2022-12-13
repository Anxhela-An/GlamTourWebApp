package lesson10;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> list = 
				new LinkedList<>();
		
		list.add(10);
		list.add(7);
		list.add(4);
		list.add(31);
		list.add(-19);
		
		Queue<Integer> queue = 
				(Queue<Integer>) list;
		
		int first = queue.peek();
		System.out.println(first);
		
		first = queue.element();
		System.out.println(first);
		
		/***
		 * queue
		 * dequeue
		 * */
		
		first = queue.remove();
		System.out.println(first);
		
		first = queue.remove();
		System.out.println(first);
		
		first = queue.remove();
		System.out.println(first);
		
		System.out.println(queue.isEmpty());
		
	}
	
}