package lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {

		Map<Integer, List<Integer>> map = new HashMap<>();
	
		/**
		 * size
		 * put
		 * get
		 * remove
		 * */
		
		map.put(1, Arrays.asList(10, 7, 4, 31, -19));
		map.put(2, Arrays.asList());
		map.put(3, Arrays.asList(8, 5, 2, 9));
		map.put(4, Arrays.asList(10000));
		map.put(5, Arrays.asList(-9, 10, 15));

		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get(3));
		
		map.remove(3);
		
		System.out.println(map.get(3));
		
		
	}
}
