package lesson10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
	
	/**
	 * Ne Java jane implementuar 3 lloje
	 * bashkesish:
	 * 
	 * 	1. matematikore
	 * 			
	 * 		elementet jane pa radhe
	 * 		elementet jane unik
	 * 
	 *	2. te renditura
	 *
	 *		Elementet do perdoren sipas radhes
	 *		se vendosjes.
	 *		Elementet jane unik.
	 *
	 *	3. te navigueshme
	 *
	 *		Elementet mund te vecohen me ane te 
	 *		disa metodave
	 * */
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Ouagadougou");
		set.add("Tirana");
		set.add("Riad");
		set.add("Tepelene");
		set.add("Riad");
		set.add("Tepelene");
		System.out.println(set);
	    //i printon elementet pa perseritje dhe sipas nje rendi te caktuar
		
		Set<String> orderedSet = new LinkedHashSet<>();
		orderedSet.add("Ouagadougou");
		orderedSet.add("Tirana");
		orderedSet.add("Riad");
		orderedSet.add("Tepelene");
		orderedSet.add("Riad");
		orderedSet.add("Tepelene");
		System.out.println(orderedSet);
		//i printon elementet pa perseritje dhe sipas rendit ne te cilin i kemi shkruar
		
		
		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(10);
		navigableSet.add(7);
		navigableSet.add(4);
		navigableSet.add(31);
		navigableSet.add(-19);
		navigableSet.add(5);
		navigableSet.add(9);
		
		int n = navigableSet.floor(6);
		System.out.println(n);
		
		int m = navigableSet.ceiling(6);
		System.out.println(m);
		while(true) {
			try {
				int k = navigableSet.ceiling(m + 1);
				System.out.println(k);
				m = k;
			}
			catch(Exception e) {
				break;
			}
		}
		
		n = navigableSet.first();
		System.out.println(n);
		
		m = navigableSet.last();
		System.out.println(m);
		
	}

}