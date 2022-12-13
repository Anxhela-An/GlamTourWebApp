package lesson6.lambda;

import lesson4.Condition;

public class Example1 {

	/**
	 *	Shprehjet lambda jane shprehje
	 *  qe mundesojne krijimin e objekteve
	 *  per interfacet e funksionalitetit.
	 *  Keto shprehje, njesoj si klasat
	 *  anonime, krijojne edhe zhvillimin
	 *  e interface edhe krijimin e objektit
	 *  ne te njejtin instruksion.
	 *  Struktura qe perdor shprehja lambda
	 *  varet komplet nga metoda e interface.
	 *  
	 *   Forma e shprehjes:
	 *   
	 *   	(emertime per listen e parametrave te metodes) -> zhvillim metode;
	 *   
	 *  Shprehja lambda ben zhvillimin e metodes.
	 **/
	
	public static void main(String[] args) {
		
		Condition c = (n1, n2) -> n1 > n2;
		
		boolean res = c.test(10, 5);
		
		System.out.println(res);
		
		Condition c2 = (int n1, int n2) -> n1 < n2;
		Condition c3 = (int a, int b) -> {
			if(a > b) {
				return true;
			}
			else {
				return false;
			}
		};
		
		
	}
	
}
