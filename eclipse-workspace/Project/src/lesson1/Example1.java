package lesson1;

public class Example1 {
	
	/**
	 * Kush jane tipet primitiv?
	 * byte, char, short, int, long, 
	 * float, double, boolean
	 * Sa eshte hapesira qe rezervohet
	 *  ne kujtese per secilin tip?
	 * Kush jane vlerat qe mund te 
	 * ruhen ne kete hapesire te rezervuar?
	 * Si perdoren vlerat e ruajtura 
	 * ne veprimet me operatoret?
	 * */

	public static void main(String[] args) {

		int nr1 = 65, nr2 = 2;
		System.out.println(nr1 / nr2);
	
		char nr3 = (char) nr1;
		//explicit cast
		
		long nr4 = nr1;
		//auto cast
		
		System.out.println(nr3);
		System.out.println(nr4);
		
		long nr5 = 12_345_678_901L;
				  //12'345'678'901
		
		System.out.println(nr5);
		
	}
	
}
