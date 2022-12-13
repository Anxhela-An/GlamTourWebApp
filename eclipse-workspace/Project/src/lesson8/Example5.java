package lesson8;

import java.io.File;
import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args) {

		File file = new File("c:/users/"
				+ "professional/desktop/info.txt");
		
		try {
			
			/**
			 * Bej nje program qe lexon skedarin tekst
			 * info.txt dhe afishon gjatesine e cdo
			 *  rreshti te tij.
			 * */

			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine().length());
			}
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}






