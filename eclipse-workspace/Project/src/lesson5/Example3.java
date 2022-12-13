package lesson5;

import java.util.ArrayList;

public class Example3 {

	/**
	 *	Nderto nje metode qe merr si
	 *  argument nje liste me stringje
	 *  dhe kthen nje liste te re qe
	 *  ruan stringjet me gjatesi numer tek. 
	 **/
	
	public static ArrayList<String> strTek(ArrayList<String> s) {
		ArrayList<String> element2 = new ArrayList<String>();
		for (String element : s) {
			if (element.length() % 2 != 0) {
				element2.add(element);
			}
		}
		return element2;
	}
	
	public static void main(String[] args) {
		ArrayList<String> element= new ArrayList<String>();
	element.add("noizy");
	element.add("denisi eshte otr");
	element.add("klausi eshte tba");
	element.add("noiz");
	element.add("noizy eshte noizy");
	System.out.println(strTek( element));
	}
}
